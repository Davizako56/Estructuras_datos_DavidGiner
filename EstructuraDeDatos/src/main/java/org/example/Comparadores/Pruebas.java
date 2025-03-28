package org.example.Comparadores;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Pruebas {

    public static void main(String[] args) {

        ArrayList<Integer> numeritos = new ArrayList<>(Arrays.asList(3,2,45,23,5));

        Collections.sort(numeritos);
        System.out.println(numeritos);

        ArrayList<String> nombres = new ArrayList<>(Arrays.asList("Patricia", "Pol", "Izan", "Andrew"));

        Collections.sort(nombres);
        Collections.reverse(nombres);
        System.out.println(nombres);

        ArrayList<Producto> listaProductos = new ArrayList<>();
        listaProductos.add(new Producto("Suadera", 6));
        listaProductos.add(new Producto("Pan", 1));
        listaProductos.add(new Producto("Arroz", 4));
        listaProductos.add(new Producto("Arroz", 6));

        Collections.sort(listaProductos, new CompararPorPrecios().reversed());
        System.out.println(listaProductos);
    }
}
