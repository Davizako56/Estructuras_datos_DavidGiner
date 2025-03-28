package org.example.Temperaturas;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RegistroTemperaturas {

    static Scanner entrada = new Scanner(System.in);
    private HashMap<String,Integer> mapaTemperaturas;

    public RegistroTemperaturas() {
        mapaTemperaturas = new HashMap<>();
    }

    public void insertarTemperatura(String ciudad, Integer temperatura) {
        mapaTemperaturas.put(ciudad,temperatura);
    }

    public void actualizarTemperatura(String ciudad) {
        System.out.println("Inserte la temperatura de " + ciudad + ":");
        mapaTemperaturas.put(ciudad, entrada.nextInt());
    }

    public void consultarTemperatura() {
        System.out.println("Introduzca la ciudad a consultar:");
        String ciudad = entrada.next();

        if (mapaTemperaturas.containsKey(ciudad)) {
            System.out.println("La temperatura en " + ciudad + " es de " + mapaTemperaturas.get(ciudad));
        }else{
            System.out.println("La ciudad de " + ciudad + " no existe en el mapa");
        }

    }

    public void mostrar() {
        System.out.println("Mostrar temperaturas:");

        for (Map.Entry<String,Integer> temperatura : mapaTemperaturas.entrySet()) {
            System.out.println(temperatura);
        }
    }

    @Override

    public String toString() {
        return "[Temperaturas: " + mapaTemperaturas + "]";
    }
}
