/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cuentabancariamavenjunit;

/**
 *
 * @author crist
 */
public class CuentaBancariaMavenJUnit {

    public static void main(String[] args) {
        
        //Este ejemplo es de cómo haríamos la prueba del método SIN Usar una herramienta
        // especializada en testing cómo JUnit. Sólo sirve a modo de ejemplo
        
        final double montoDeposito  = 500;
        Cuenta cuenta = new Cuenta("24354545", "Cristhian Fernandez");
        
        cuenta.depositarDinero(montoDeposito);
        
        double saldo = cuenta.getSaldo();
        
        if(saldo == montoDeposito)
        {
            System.out.println("PASO LA PRUEBA");
        }
        else
        {
            System.out.println("NO PASO LA PRUEBA");
        }
        
    }
}
