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
@WebService(serviceName = "Cleaner")
public class Cleaner {

    @WebMethod(operationName = "washDishes")
    public boolean washDishes(@WebParam(name = "dishes") int dishes) {
        return new Cook().breakEggs(dishes * 2);
    }
    
    @WebMethod(operationName = "ventilateAir")
    public boolean ventilateAir(@WebParam(name = "seconds") int seconds) {
        return true;
    } 
}
