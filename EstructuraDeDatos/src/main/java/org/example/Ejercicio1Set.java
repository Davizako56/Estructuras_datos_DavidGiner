package org.example;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Ejercicio1Set {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca una frase...");
        String frase = entrada.nextLine();

        String[] partes = frase.split(" ");

        Set<String> palabras = new HashSet<>(Arrays.asList(partes));

        System.out.println();
        System.out.println(palabras);
    }
}
