package org.example.Diccionario;
import java.util.Scanner;

public class AppDiccionario {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        Diccionario diccionario = new Diccionario();

        diccionario.nuevoPar("Perro", "Dog");
        diccionario.nuevoPar("Mesa", "Table");
        diccionario.nuevoPar("Coche", "Car");
        diccionario.nuevoPar("Gato", "Cat");

        System.out.println("¿Que palabra quieres traducir?");

        diccionario.traduce(entrada.next());
    }
}
