package org.example.Informe;
import java.util.HashSet;
import java.util.Stack;

public class AppFuncionario {

    static Stack<Informe> pilaInformes = new Stack<>();
    static HashSet<Informe> listaInforme = new HashSet<>();

    public static void main(String[] args) {

        pilaInformes.push(new Informe(1, "Grapar documentos", Tipos.ADMINISTRATIVO));
        pilaInformes.push(new Informe(1, "Atender llamadas", Tipos.ADMINISTRATIVO));
        pilaInformes.push(new Informe(2, "Ir a por folios", Tipos.ADMINISTRATIVO));
        pilaInformes.push(new Informe(1, "Llamar a casa", Tipos.PERSONAL));
        pilaInformes.push(new Informe(2, "Comprar pan", Tipos.PERSONAL));

        while (!pilaInformes.isEmpty()) {

            System.out.println("Despachando " + pilaInformes.pop());
        }

        System.out.println();

        pilaInformes.push(new Informe(1, "Grapar documentos", Tipos.ADMINISTRATIVO));
        listaInforme.add(new Informe(1, "Grapar documentos", Tipos.ADMINISTRATIVO));
        pilaInformes.push(new Informe(1, "Atender llamadas", Tipos.ADMINISTRATIVO));
        listaInforme.add(new Informe(1, "Atender llamadas", Tipos.ADMINISTRATIVO));
        pilaInformes.push(new Informe(2, "Ir a por folios", Tipos.ADMINISTRATIVO));
        listaInforme.add(new Informe(2, "Ir a por folios", Tipos.ADMINISTRATIVO));


        for (int i = 0; i < pilaInformes.size(); i++) {
            System.out.println(pilaInformes.get(i));
        }

        System.out.println("Tienes " + listaInforme.size() + " tipos de tareas distintas");

        pilaInformes.pop();
    }



}
