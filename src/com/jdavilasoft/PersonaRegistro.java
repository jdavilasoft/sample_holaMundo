package com.jdavilasoft;

public record PersonaRegistro(String nombre, String apellido) {

    @Override
    public String toString() {
        System.out.println("Esta mensaje no sirve ");
        return "%s %s".formatted(nombre, apellido);
    }

}
