/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.dtu.cookingcleaning;

import dk.dtu.cookingcleaning.fault.EggSmellFault;
import dk.dtu.cookingcleaning.fault.FaultType;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author superdids
 */
@WebService(serviceName = "Cook")
public class Cook {

    private Semaphore lock = new Semaphore(1);
    private static int eggsBroken = 0;
    
    @WebMethod(operationName = "bakeOmelet")
    public boolean bakeOmelet(@WebParam(name = "seconds") int seconds) {
        System.out.println("Baking " + seconds / 10 + " omelets.");
        return new Cleaner().ventilateAir(seconds);
    }

    @WebMethod(operationName = "breakEggs")
    public boolean breakEggs(@WebParam(name = "eggs") int eggs) throws EggSmellFault {
        
        try {
            lock.acquire();
            ++eggsBroken;
            lock.release();
        } catch (InterruptedException ex) {
            Logger.getLogger(Cook.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        ++eggsBroken;
       
        if(eggsBroken % 2 == 0) {
            FaultType eggSmell = new FaultType(); //initializes detail to "eggSmellsBad".
            throw new EggSmellFault("Bad egg smell", eggSmell);
        }
 
        String suffix = eggs == 1 ? " egg." : "eggs.";
        System.out.println("Breaking " + eggs + suffix);
        return bakeOmelet(eggs * 10);
    }

}
