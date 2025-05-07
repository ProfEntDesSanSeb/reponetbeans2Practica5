/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica5;

/**
 *
 * @author alexm
 */
public class Practica5 {

    public static void main(String[] args) {

    // Depuracion. Se detiene siempre
    CCuenta miCuenta = new CCuenta();

    System.out.println("Saldo Inicial: " + miCuenta.dSaldo + " euros");

    // Depuracion. Provoca parada por ingreso con cantidad menor de 0
    miCuenta.ingresar(-100);

    System.out.println("Saldo Inicial: " + miCuenta.dSaldo + " euros");

    miCuenta.ingresar(100);
    System.out.println("Saldo tras ingreso: " + miCuenta.dSaldo + " euros");

    miCuenta.ingresar(200);
    System.out.println("Saldo tras ingreso: " + miCuenta.dSaldo + " euros");

    // Depuracion. Provoca parada con codicion de tercer ingreso
    miCuenta.ingresar(300);
    System.out.println("Saldo tras ingreso: " + miCuenta.dSaldo + " euros");

    miCuenta.retirar(50);
    System.out.println("Saldo tras retirada: " + miCuenta.dSaldo + " euros");
    System.out.println("Saldo tras retirada: " + miCuenta.dSaldo + " 1euros");
    System.out.println("Saldo tras retirada: " + miCuenta.dSaldo + " 2euros");
    System.out.println("Saldo tras retirada: " + miCuenta.dSaldo + " 3euros");
    System.out.println("Saldo tras retirada: " + miCuenta.dSaldo + " 3euros");
    System.out.println("Saldo tras retirada: " + miCuenta.dSaldo + " 3euros");
    System.out.println("Saldo tras retirada: " + miCuenta.dSaldo + " 3euros");
}
    
}
