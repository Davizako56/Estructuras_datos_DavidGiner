package org.example;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio5Colas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Inserte una palabra");
        String palabra = entrada.next();

        String[] palabra1 = palabra.split("");

        Deque<String> cola_normal = new LinkedList<>();
        Deque<String> cola_reversa = new LinkedList<>();

        for (String s : palabra1) {

            cola_normal.offer(s);
        }

        for (int i = palabra1.length - 1; i >= 0; i--) {

            cola_reversa.offer(palabra1[i]);
        }

        if (cola_normal.equals(cola_reversa)) {

            System.out.println("La palabra es un palíndromo");
        }else{
            System.out.println("La palabra no es un palíndromo");
        }
    }
}
