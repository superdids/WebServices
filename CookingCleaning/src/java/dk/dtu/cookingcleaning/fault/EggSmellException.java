/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.dtu.cookingcleaning.fault;

import javax.xml.ws.WebFault;

/**
 *
 * @author superdids
 */
@WebFault(name="EggSmellFault")
public class EggSmellException extends Exception {

    private EggSmellFault faultInfo;

    public EggSmellException(String message, EggSmellFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    public EggSmellException(String message, EggSmellFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    public EggSmellFault getFaultInfo() {
        return faultInfo;
    }
    
    public void setFaultInfo(EggSmellFault faultInfo) {
        this.faultInfo = faultInfo; 
    }
}
