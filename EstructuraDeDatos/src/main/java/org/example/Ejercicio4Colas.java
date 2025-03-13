package org.example;
import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;

public class Ejercicio4Colas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] opciones = {"1. Añadir producto al final","2. Eliminar primer producto","3. Eliminar producto por nombre","4. Ver primer producto","5. Buscar producto","6. Mostrar lista actual","X. Salir"};

        System.out.println("--- LISTA DE LA COMPRA ---");

        for (String s : opciones) {
            System.out.println(s);
        }

        System.out.println();
        System.out.println("Seleccione una opción:");
        String eleccion = entrada.next();

        Deque<String> lista = new LinkedList<>();

        switch(eleccion) {

            case "1":
                String producto = entrada.next();
                lista.offer(producto);
                break;
        }
    }
}
