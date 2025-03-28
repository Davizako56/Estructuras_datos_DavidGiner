package org.example.Diccionario;
import java.util.Random;
import java.util.Scanner;
import java.util.HashMap;

public class Diccionario {

    static Random random = new Random();
    static Scanner entrada = new Scanner(System.in);

    private HashMap<String,String> diccionario;

    public Diccionario() {

        diccionario = new HashMap<>();
    }

    public void nuevoPar(String clave, String valor) {

        diccionario.put(clave, valor);
    }

    public void traduce(String clave) {

        for(String s : diccionario.keySet()) {

            if (s.equals(clave)) {

                System.out.println(diccionario.get(clave));
            }
        }
    }

    public void palabraAleatoria() {


    }
}
