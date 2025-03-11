package org.example;
import java.util.Scanner;
import java.util.Stack;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce la operación matemática:");
        String operacion = entrada.next();

        if (esBalanceado(operacion)) {
            System.out.println("Los paréntesis están bien cerrados");
        }else{
            System.out.println("Los paréntesis no están bien cerrados");
        }
    }

    public static boolean esBalanceado(String operacion) {
        Stack<String> pila = new Stack<>();
        String[] operacion_vector = operacion.split("");

        for (int i = 0; i < operacion_vector.length; i++) {

            if(operacion_vector[i].equals("(")) {
                pila.push(operacion_vector[i]);
            }else if (operacion_vector[i].equals(")") && pila.contains("(")){
                pila.pop();
            }
        }

        if (pila.isEmpty()) {
            return true;
        }else{
            return false;
        }
    }
}
