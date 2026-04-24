package com.BacApp.es.Modelos;

public class Usuario {
    private String usuario;
    private String contraseña;
    private CuentaBancaria cuenta;

    public Usuario(String usuario, String contraseña, String cuenta) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.cuenta = cuenta;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public CuentaBancaria getCuenta() {
        return cuenta;
    }

    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(" Usuario { ");
        sb.append(" Usuario='").append(usuario).append('\n');
        sb.append(" contraseña='").append(contraseña).append('\n');
        sb.append(" Cuenta=").append(cuenta);
        sb.append('}');
        return sb.toString();
    }


}
