package org.example;
import java.util.Scanner;
import java.util.Set;
import java.util.LinkedHashSet;

public class Ejercicio3Set {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Set<String> historial = new LinkedHashSet<>();
        int i = 1;

        while(true) {

            System.out.println("Escribe una URL visitada (o salir para terminar):");
            String pagina = entrada.next();

            if (pagina.equalsIgnoreCase("salir")) {
                break;
            }else{
                historial.add(pagina);
            }
        }

        System.out.println("Historial de navegación:");

        for (String s : historial) {
            System.out.println(i + ". " + s);
            i++;
        }
    }
}
