/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.dtu.cookingcleaning;

import dk.dtu.cookingcleaning.fault.EggSmellException;
import java.util.Arrays;
import java.util.function.Predicate;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author superdids
 */
@WebService(serviceName = "Cleaner")
public class Cleaner {

    @WebMethod(operationName = "washDishes")
    public boolean washDishes(@WebParam(name = "dishes") int dishes) {      
        System.out.println("Washing " + dishes + "dishes");
        return true;
    }
    
    @WebMethod(operationName = "ventilateAir")
    public boolean ventilateAir(@WebParam(name = "seconds") int seconds) {
        System.out.println("Ventilating the air for " + seconds + " seconds.");
        return true;
    } 
}
