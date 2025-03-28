package org.example.Inmutabilidad;
import java.util.List;

public class Pruebas {

    public static void main(String[] args) {

        Juego pokemon = new Juego("Pokemon Plata", 100);

        List<String> listaPokemons = pokemon.getListaPersonajes();
        listaPokemons.add("Pikachu");

        pokemon.getListaPersonajes().add("Squirtle");
        pokemon.getListaPersonajes().add("Charmander");

        System.out.println(pokemon.getListaPersonajes());
    }
}
