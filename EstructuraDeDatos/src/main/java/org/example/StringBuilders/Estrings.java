package org.example.StringBuilders;

public class Estrings {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hola ");
        sb.append(" que tal");
        sb.insert(5, "soy Patri");
        sb.replace(5, 8, "somos");
        sb.delete(0,5);

        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

    }
}
