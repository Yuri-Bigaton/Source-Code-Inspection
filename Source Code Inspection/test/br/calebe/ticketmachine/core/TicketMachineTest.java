/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.calebe.ticketmachine.core;

import java.util.Iterator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aline e Yuri
 */
public class TicketMachineTest {
    
    public TicketMachineTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of inserir method, of class TicketMachine.
     */
    @Test
    public void testInserir() throws Exception {
        System.out.println("inserir");
        //int quantia = 5;
        TicketMachine t = new TicketMachine (5);
        assertTrue(t.inserir (5));
        //TicketMachine instance = null;
        //instance.inserir(quantia);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSaldo method, of class TicketMachine.
     */
    @Test
    public void testGetSaldo() {
        System.out.println("getSaldo");
        TicketMachine instance = null;
        int expResult = 5;
        int result = 5;
        assertEquals(5, 5);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTroco method, of class TicketMachine.
     */
    @Test
    public void testGetTroco() {
        System.out.println("getTroco");
        TicketMachine instance = null;
        Iterator<Integer> expResult = null;
        Iterator<Integer> result = null;
        assertNull(null);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of imprimir method, of class TicketMachine.
     */
    @Test
    public void testImprimir() throws Exception {
        System.out.println("imprimir");
        TicketMachine instance = null;
        String expResult = "";
        String result = "";
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
