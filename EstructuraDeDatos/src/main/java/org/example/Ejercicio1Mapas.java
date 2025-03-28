package org.example;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio1Mapas {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Introduce una frase:");
        String frase = entrada.nextLine();

        String[] palabras = frase.split(" ");

        Map<String,Integer> mapaPalabras = new HashMap<>();

        for (String palabra : palabras) {
            mapaPalabras.put(palabra,mapaPalabras.getOrDefault(palabra,0) + 1);
        }

        for (Map.Entry<String,Integer> palabra : mapaPalabras.entrySet()) {
            System.out.println(palabra.getKey() + ": " + palabra.getValue());
        }
    }
}
