
package org.netbeans.j2ee.wsdl.hamandeggsbpel.src.hamandeggs;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "hamandeggsPortType", targetNamespace = "http://j2ee.netbeans.org/wsdl/HamAndEggsBPEL/src/hamandeggs")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface HamandeggsPortType {


    /**
     * 
     * @param n
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "result", partName = "result")
    public int hamandeggsOperation(
        @WebParam(name = "n", partName = "n")
        int n);

}
