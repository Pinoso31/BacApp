package com.BacApp.es.Servicios;
import com.BacApp.es.Modelos.CuentaBancaria;
import com.BacApp.es.Modelos.Usuario;
import java.util.ArrayList;
import java.util.Arrays;

public class BancoServicio {

    private ArrayList<Usuario> usuarios = new ArrayList<>();

    // Registrar usuario
    public boolean registrar(String usuario, String contrasena, String nombre, String apellido, String numeroCuenta) {

        for (Usuario u : usuarios) {
            if (u.getUsuario().equals(usuario)) {
                System.out.println("El usuario ya existe.");
                return false;
            }
        }

        usuarios.add(new Usuario(usuario, contrasena, nombre, apellido, numeroCuenta));
        return true;
    }

    // Login
    public Usuario iniciarSesion(String usuario, String contrasena) {
        for (Usuario u : usuarios) {
            if (u.getUsuario().equals(usuario) && u.getContrasena().equals(contrasena)) {
                return u;
            }
        }
        return null;
    }
}
