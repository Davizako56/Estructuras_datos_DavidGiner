package org.example.Comparadores;
import java.util.Comparator;

public class CompararPorPrecios implements Comparator<Producto> {


    @Override
    public int compare(Producto producto1, Producto producto2) {

        int comparacionPrecio = producto1.getPrecio().compareTo(producto1.getPrecio());

        if (comparacionPrecio != 0) {
            return comparacionPrecio;
        }

        return producto1.getNombre().compareTo(producto2.getNombre());
    }
}
