package org.example;
import java.util.Stack;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    Stack<Integer> numeros = new Stack<>();

    System.out.println("Introduce el primer número:");
    int num1 = entrada.nextInt();
    numeros.push(num1);
    System.out.println("Introduce el segundo número:");
    int num2 = entrada.nextInt();
    numeros.push(num2);
    System.out.println("Introduce el tercer número:");
    int num3 = entrada.nextInt();
    numeros.push(num3);
    System.out.println("Números en orden inverso:");

    while (!numeros.empty()) {
        System.out.println(numeros.pop());
    }

    }
}
