package org.example;
import java.util.Queue;
import java.util.LinkedList;

public class Ejercicio3Colas {

    public static void main(String[] args) {

        Queue<String> playlist = new LinkedList<>();

        playlist.offer("Let it be - The Beatles");
        playlist.offer("Bohemian Rhapsody - Queen");
        playlist.offer("Shape of you - Ed Sheeran");
        playlist.offer("Blinding Lights - The Weeknd");
        playlist.offer("Stay - Justin Bieber");

        System.out.println("Estado inicial de la playlist: " + playlist);

        while(!playlist.isEmpty()) {
            System.out.println("Reproduciendo: " + playlist.peek());
            playlist.poll();
            System.out.println("Estado de la playlist después de reproducir una canción: " + playlist);
        }

        System.out.println("La playlist ha terminado.");
    }
}
