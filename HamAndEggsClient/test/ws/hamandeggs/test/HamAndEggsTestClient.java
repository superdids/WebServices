/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.hamandeggs.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author superdids
 */
public class HamAndEggsTestClient {

    @Test
    public void testHamAndEggs() {
        int result = hamandeggsOperation(4);
        assertEquals(result, 2);
    }
    
    private static int hamandeggsOperation(int n) {
        org.netbeans.j2ee.wsdl.hamandeggsbpel.src.hamandeggs.HamandeggsService service = new org.netbeans.j2ee.wsdl.hamandeggsbpel.src.hamandeggs.HamandeggsService();
        org.netbeans.j2ee.wsdl.hamandeggsbpel.src.hamandeggs.HamandeggsPortType port = service.getHamandeggsPort();
        return port.hamandeggsOperation(n);
    }
}
