package org.example;
import java.util.Stack;

public class Ejercicio1 {

    public static void main(String[] args) {

        Stack<Character> letras = new Stack<>();

        letras.push('a');
        letras.push('e');
        letras.push('i');
        letras.push('o');
        letras.push('u');

        if (letras.isEmpty()) {
            System.out.println("La pila está vacía");
        }else{
            System.out.println("La pila no está vacía");
        }

        System.out.println();

        System.out.println(letras.size());

        System.out.println();

        System.out.println(letras.peek());

        System.out.println();

        while(!letras.empty()) {
            System.out.println(letras.pop());
        }
    }

}
