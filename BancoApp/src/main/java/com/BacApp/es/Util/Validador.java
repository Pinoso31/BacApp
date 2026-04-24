package com.BacApp.es.Util;

public class Validador {

    public static boolean textoValido(String texto) {
        return texto != null && !texto.trim().isEmpty();
    }

    public static boolean montoValido(double monto) {
        return monto > 0;
    }
}