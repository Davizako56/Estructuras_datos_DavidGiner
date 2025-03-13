package org.example;
import java.util.Queue;
import java.util.LinkedList;

public class Ejercicio2Colas {

    public static void main(String[] args) {

        Queue<String> tareas = new LinkedList<>();

        tareas.offer("Imprimir documento 1");
        tareas.offer("Imprimir documento 2");
        tareas.offer("Imprimir documento 3");
        tareas.offer("Imprimir documento 4");
        tareas.offer("Imprimir documento 5");

        System.out.println("Estado de la cola después de procesar el trabajo: " + tareas);

        while (!tareas.isEmpty()) {

            System.out.println("Procesando: " + tareas.peek());
            tareas.poll();
            System.out.println("Estado de la cola después de procesar el trabajo: " + tareas);
        }

        System.out.println("No hay mas trabajos en la cola de impresión");
    }
}
