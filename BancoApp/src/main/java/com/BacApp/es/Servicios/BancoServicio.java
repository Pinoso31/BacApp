package com.BacApp.es.Servicios;
import com.BacApp.es.Modelos.CuentaBancaria;
import com.BacApp.es.Modelos.Usuario;
import java.util.ArrayList;
import java.util.Arrays;

public class BancoServicio {

    private ArrayList < Usuario > usuarios = new ArrayList<>();
    public void registrarUsuario( String usuario, String contraseña, String Cuenta) {
        usuarios.add(new Usuario(usuario, contraseña, Cuenta));
    }

    public Usuario login (String usuario, String contraseña) {
        for ( Usuario u : usuarios) {
            if ( u.getUsuario().equals(usuario) && u.getContraseña().equals(contraseña)) {
                return u;
            }
        }
        return null;
    }

}
