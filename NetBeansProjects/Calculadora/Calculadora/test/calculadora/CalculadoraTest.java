/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author katht
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
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
     * Test of sumar method, of class Calculadora.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        Calculadora instance = new Calculadora(5,10);
        float expResult = 15;
        float result = instance.sumar();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of restar method, of class Calculadora.
     */
    @Test
    public void testRestar() {
        System.out.println("restar");
        Calculadora instance = new Calculadora(4,10);
        float expResult = -6;
        float result = instance.restar();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of multiplicar method, of class Calculadora.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        Calculadora instance = new Calculadora(5,4);
        float expResult = 20;
        float result = instance.multiplicar();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of dividir method, of class Calculadora.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        Calculadora instance = new Calculadora(10,2);
        float expResult = 5;
        float result = instance.dividir();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getN1 method, of class Calculadora.
     */
    @Test
    public void testGetN1() {
        System.out.println("getN1");
        Calculadora instance = new Calculadora(2,8);
        float expResult = 2;
        float result = instance.getN1();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getN2 method, of class Calculadora.
     */
    @Test
    public void testGetN2() {
        System.out.println("getN2");
        Calculadora instance = new Calculadora(8,16);
        float expResult = 16;
        float result = instance.getN2();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setN1 method, of class Calculadora.
     */
    @Test
    public void testSetN1() {
        System.out.println("setN1");
        float n1 = 0.0F;
        Calculadora instance = new Calculadora();
        instance.setN1(n1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setN2 method, of class Calculadora.
     */
    @Test
    public void testSetN2() {
        System.out.println("setN2");
        float n2 = 0.0F;
        Calculadora instance = new Calculadora();
        instance.setN2(n2);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
