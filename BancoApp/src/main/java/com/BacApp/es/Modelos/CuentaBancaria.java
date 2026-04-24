package com.BacApp.es.Modelos;


public class CuentaBancaria {

    private String numeroCuenta;
    private double saldo;

    public CuentaBancaria(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    // Métodos seguros
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito exitoso.");
        } else {
            System.out.println("Monto inválido.");
        }
    }

    public void retirar(double monto) {
        if (monto <= 0) {
            System.out.println("Monto inválido.");
        } else if (monto > saldo) {
            System.out.println("Fondos insuficientes.");
        } else {
            saldo -= monto;
            System.out.println("Retiro exitoso.");
        }
    }
}