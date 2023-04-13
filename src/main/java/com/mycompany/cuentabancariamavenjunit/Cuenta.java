/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cuentabancariamavenjunit;

/**
 *
 * @author crist
 */
public class Cuenta {
    
    private String numeroCuenta;
    private String nombreTitular;
    private double saldo;

    public Cuenta(String numeroCuenta, String nombreTitular) {
        this.numeroCuenta = numeroCuenta;
        this.nombreTitular = nombreTitular;
        this.saldo = 0;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public boolean saldoEstaEnCero()
    {
        return this.saldo == 0;
    }
    
    public void depositarDinero(double importeDeposito)
    {
        if(importeDeposito > 0)
        {
            this.saldo = this.saldo + importeDeposito; 
        }
        else if(importeDeposito == 0) 
        {
            System.out.println("No se puede depositar un monto igual a cero");
        }
        else
        {
            System.out.println("No se puede depositar un monto negativo");
        } 
    }
    
    public String extraerDinero(double importeExtraccion)
    {
        if(importeExtraccion <= this.saldo)
        {
            this.saldo = this.saldo - importeExtraccion;
            return "OK";
        }
        else
        {
            return "No se puede extraer";
        }
    }
    
}
