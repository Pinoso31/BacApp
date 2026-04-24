package com.BacApp.es.Modelos;

import com.BacApp.es.Modelos.CuentaBancaria;

public class Usuario {

    private String usuario;
    private String contrasena;
    private String nombre;
    private String apellido;
    private CuentaBancaria cuenta;

    public Usuario(String usuario, String contrasena, String nombre, String apellido, String numeroCuenta) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuenta = new CuentaBancaria(numeroCuenta);
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public CuentaBancaria getCuenta() {
        return cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public boolean cambiarContrasena(String actual, String nueva) {
        if (this.contrasena.equals(actual)) {
            this.contrasena = nueva;
            return true;
        }
        return false;
    }
}