/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.practica5;

import com.mycompany.practica5.CCuenta;
import org.junit.Test;
import static org.junit.Assert.*;



/**
 *
 * @author alexm
 */
public class CCuentaTest {
    
    public CCuentaTest() {
    }

    @org.junit.Test
    public void testIngresar() {
        System.out.println("ingresar");
        double cantidad = 5.0;
        CCuenta instance = new CCuenta();
        int expResult = 0;
        int result = instance.ingresar(cantidad);
        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
    }

//    @Test
//    public void testRetirar() {
//        System.out.println("retirar");
//        double cantidad = 0.0;
//        CCuenta instance = new CCuenta();
//        instance.retirar(cantidad);
//        fail("The test case is a prototype.");
//    }
    
}
@org.junit.Test
    public void testIngresar1() {
        System.out.println("ingresar");
        double cantidad = -5.0;
        CCuenta instance = new CCuenta();
        int expResult = 1;
        int result = instance.ingresar(cantidad);
        assertEquals(expResult, result);}

@org.junit.Test
    public void testIngresar2() {
        System.out.println("ingresar");
        double cantidad = -3.0;
        CCuenta instance = new CCuenta();
        int expResult = 2;
        int result = instance.ingresar(cantidad);
        assertEquals(expResult, result);}

    @Test
    public void testIngresar() {
        System.out.println("ingresar");
        double cantidad = 0.0;
        CCuenta instance = new CCuenta();
        int expResult = 0;
        int result = instance.ingresar(cantidad);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testRetirar() {
        System.out.println("retirar");
        double cantidad = 0.0;
        CCuenta instance = new CCuenta();
        instance.retirar(cantidad);
        fail("The test case is a prototype.");
    }
