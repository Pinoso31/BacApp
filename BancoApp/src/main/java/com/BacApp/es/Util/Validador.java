package com.BacApp.es.Util;

public class Validador {
    public static boolean esNumeroValido(double cuenta) {
        return cuenta > 0;
    }

    public static boolean textoValido(String texto) {
        return texto != null && !texto.trim().isEmpty();
    }
}
