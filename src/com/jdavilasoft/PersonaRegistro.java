package com.jdavilasoft;

public record PersonaRegistro(String nombre, String apellido) {

    @Override
    public String toString() {
        // Alejandro la siguiente linea la comenté para eliminar
        //System.out.println("Esta mensaje no sirve ");
        return "%s %s".formatted(nombre, apellido);
    }

}
