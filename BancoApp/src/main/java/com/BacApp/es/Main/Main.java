package com.BacApp.es.Main;

import com.BacApp.es.Modelos.Usuario;
import com.BacApp.es.Servicios.BancoServicio;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        BancoServicio banco = new BancoServicio();
        Usuario usuarioActual;

        int opcion;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "1. Crear cuenta\n2. Iniciar sesión\n3. Salir"
            ));

            switch (opcion) {

                case 1:
                    String usuario = JOptionPane.showInputDialog("Usuario:");
                    String contrasena = JOptionPane.showInputDialog("Contraseña:");
                    String nombre = JOptionPane.showInputDialog("Nombre:");
                    String apellido = JOptionPane.showInputDialog("Apellido:");
                    String numeroCuenta = JOptionPane.showInputDialog("Número de cuenta:");

                    if (banco.registrar(usuario, contrasena, nombre, apellido, numeroCuenta)) {
                        JOptionPane.showMessageDialog(null, "Cuenta creada correctamente");
                    } else {
                        JOptionPane.showMessageDialog(null, "El usuario ya existe");
                    }
                    break;

                case 2:
                    usuario = JOptionPane.showInputDialog("Usuario:");
                    contrasena = JOptionPane.showInputDialog("Contraseña:");

                    usuarioActual = banco.iniciarSesion(usuario, contrasena);

                    if (usuarioActual != null) {
                        menuUsuario(usuarioActual);
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontraron registros");
                    }
                    break;

            }

        } while (opcion != 3);
    }

    private static void menuUsuario(Usuario usuario) {

        int opcion;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "1. Depositar\n2. Retirar\n3. Consultar saldo\n4. Salir"
            ));

            switch (opcion) {

                case 1:
                    double monto = Double.parseDouble(
                            JOptionPane.showInputDialog("Monto a depositar:")
                    );
                    usuario.getCuenta().depositar(monto);
                    JOptionPane.showMessageDialog(null, "Depósito realizado");
                    break;

                case 2:
                    monto = Double.parseDouble(
                            JOptionPane.showInputDialog("Monto a retirar:")
                    );

                    if (monto > usuario.getCuenta().getSaldo()) {
                        JOptionPane.showMessageDialog(null, "Fondos insuficientes");
                    } else {
                        usuario.getCuenta().retirar(monto);
                        JOptionPane.showMessageDialog(null, "Retiro realizado");
                    }
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null,
                            "Saldo: " + usuario.getCuenta().getSaldo());
                    break;
            }

        } while (opcion != 4);
    }
}