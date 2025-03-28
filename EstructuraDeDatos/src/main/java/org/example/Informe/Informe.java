package org.example.Informe;

import java.util.Objects;

public class Informe {

    private int codigo;
    private String descripcion;
    private Tipos tipo;

    public Informe(int codigo, String descripcion, Tipos tipo) {

        this.codigo = codigo;
        this.descripcion = descripcion;
        this.tipo = tipo;
    }

    @Override

    public String toString() {

        return "[Código: " + codigo + ", descripción: " + descripcion + ", tipo: " + tipo + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Informe informe = (Informe) o;
        return codigo == informe.codigo && Objects.equals(descripcion, informe.descripcion) && tipo == informe.tipo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, descripcion, tipo);
    }
}
