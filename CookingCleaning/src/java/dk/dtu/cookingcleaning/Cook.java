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
    
    @WebMethod(operationName = "bakeOmelet")
    public boolean bakeOmelet(@WebParam(name = "seconds") int seconds) {
        System.out.println("Baking " + seconds / 10 + " omelets.");
        return true;
    }

    @WebMethod(operationName = "breakEggs")
    public boolean breakEggs(@WebParam(name = "eggs") int eggs) { //throws EggSmellFault {
        String suffix = eggs == 1 ? " egg." : "eggs.";
        System.out.println("Breaking " + eggs + suffix);
        return true;
    }

}
