/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.dtu.cookingcleaning;

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
       return new Cleaner().ventilateAir(seconds);
    }
    
    @WebMethod(operationName = "breakEggs")
    public boolean breakEggs(@WebParam(name = "eggs") int eggs) {
        return bakeOmelet(eggs * 10);
    }
    
}
