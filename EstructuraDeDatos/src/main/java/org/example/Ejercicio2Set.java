package org.example;
import java.util.Scanner;
import java.util.Set;
import java.util.LinkedHashSet;

public class Ejercicio2Set {

    static Set<String> contactos = new LinkedHashSet<>();

    public static void main(String[] args) {

        menu();

    }

    public static void menu() {
        Scanner entrada = new Scanner(System.in);

        String[] opciones = {"1. Añadir contacto","2. Mostrar contactos","3. Buscar contactos","4. Eliminar contactos","X. Salir"};

        while(true) {

            System.out.println("------ AGENDA ------");

            for (String s : opciones) {
                System.out.println(s);
            }

            System.out.println();
            System.out.println("Elige una opcion:");
            String opcion = entrada.next();

            System.out.println();
            System.out.println("----------------------");

            switch(opcion) {

                case "1":
                    System.out.println("Nombre del nuevo contatco:");
                    String nombre = entrada.next();
                    contactos.add(nombre);
                    menu();

                case "2":
                    System.out.println("Contactos: " + contactos);
                    menu();

                case "3":
                    System.out.println("Inserte el contacto que quieres bucar:");
                    String buscar = entrada.next();

                    for (String s : contactos) {
                        if (s.equalsIgnoreCase(buscar)) {
                            System.out.println("Contacto encontrado: " + s);
                        }
                    }

                    System.out.println("El contacto " + buscar + " no ha sido encontrado en la agenda");
                    menu();

                case "4":
                    System.out.println("Elija el contacto que quieras eliminar:");
                    String eliminar = entrada.next();

                    for (String s : contactos) {
                        if (s.equalsIgnoreCase(eliminar)) {
                            System.out.println("El contacto " + s + " ha sido eliminado con éxito");
                            contactos.remove(s);
                        }
                    }

                    System.out.println("El contacto " + eliminar + " no ha sido encontrado en la agenda");
                    menu();

                case "X":
                    System.exit(0);

            }

            System.out.println("ERROR: Esa opción no entra en la agenda");
        }
    }
}
