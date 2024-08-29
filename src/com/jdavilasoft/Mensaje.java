package com.jdavilasoft;

import java.util.Scanner;

public class Mensaje {

    public String solicitaDatos(String msg) {
        System.out.println(msg);
        Scanner scs = new Scanner(System.in);
        return scs.nextLine();
    }

    public void saludar(String nombre) {
        System.out.printf("Hola %s, bienvenido a java \n", nombre);
    }
}
