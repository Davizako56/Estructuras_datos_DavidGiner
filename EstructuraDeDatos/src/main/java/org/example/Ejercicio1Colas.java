package org.example;
import java.util.Queue;
import java.util.LinkedList;

public class Ejercicio1Colas {

    public static void main(String[] args) {

        Queue<Character> cola = new LinkedList<>();

        cola.offer('a');
        cola.offer('e');
        cola.offer('i');
        cola.offer('o');
        cola.offer('u');

        if (cola.isEmpty()) {
            System.out.println("La cola está vacía");
        }else{
            System.out.println("La cola no está vacía");
        }

        System.out.println();
        System.out.println(cola.size());
        System.out.println();
        System.out.println(cola.peek());
        System.out.println();

        while(!cola.isEmpty()) {

            System.out.println(cola.poll());
        }
    }
}
