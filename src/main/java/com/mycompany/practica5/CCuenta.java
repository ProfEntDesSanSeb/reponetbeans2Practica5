/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica5;

/**
 *
 * @author alexm
 */
public class CCuenta {
    
double dSaldo;
    

public int ingresar (double cantidad) {

    int iCodErr;

    if (cantidad < 0) {
        System.out.println("No se puede ingresar una cantidad negativa");
        iCodErr = 1;
    } else if (cantidad == -3) {
        System.out.println("Error detectable en pruebas de caja blanca");
        iCodErr = 2;
    } else {
        // Depuracion. Punto de parada. Solo en el 3 ingreso
        dSaldo = dSaldo + cantidad;
        iCodErr = 0;
    }

    // Depuracion. Punto de parada cuando la cantidad es menor de 0
    return iCodErr;
}
public void retirar (double cantidad)
{
    if(cantidad <= 0)
    {
        System.out.println("No se puede retirar una cantidad negativa");
    }
    else if (dSaldo < cantidad)
    {
        System.out.println("No hay suficiente saldo");
    }
    else
    {
        dSaldo = dSaldo - cantidad;
        System.out.println("Saldo Restante: " + dSaldo);
    }
}
}

