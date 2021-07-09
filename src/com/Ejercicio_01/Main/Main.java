package com.Ejercicio_01.Main;

import java.util.ArrayList;
import java.util.Scanner;

/*
*Diseñar  un  programa  que  lea  y  guarde  razas  de  perros  en  un  ArrayList  de  tipo
String. El programa pedirá una raza de perro en un bucle, el mismo se guardará
en la lista y después se le preguntará al usuario si quiere guardar otro perro o si
quiere salir. Si decide salir, se mostrará todos los perros guardados en el ArrayList.
* */
public class Main {
    public static void main(String[] args) {
        // Lista de perros, scanner y auxiliar para ingreso de datos:
        ArrayList<String> perros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String aux;

        // Bucle para ingresar perros a la lista
        do {
            System.out.println("Ingrese una raza de perro: ");
            perros.add(sc.nextLine());

            System.out.println("Desea ingresar otro perro? (s/n)");
            aux = sc.nextLine();

            while (!aux.equalsIgnoreCase("s") && !aux.equalsIgnoreCase("n")) {
                System.out.println("ERROR. Desea ingresar otro perro (s/n)?");
                aux = sc.nextLine();
            }
        } while (!aux.equalsIgnoreCase("n"));

        System.out.println(perros);
    }
}
