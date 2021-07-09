package com.Ejercicio_02.Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/*Continuando el ejercicio anterior, después de mostrar los perros,
 al usuario se le pedirá un perro y se recorrerá la lista con un Iterator, (done)
 se buscará el perro en la lista. (done)
Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario
y se mostrará la lista ordenada.(done)*/
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

        // perro a buscar
        System.out.println("Ingrese un perro para buscar:");
        aux = sc.nextLine();

        // iterador y bucle para buscarlo y eliminarlo
        Iterator<String> iterador = perros.iterator();
        boolean encontrado = false;

        while(iterador.hasNext()){
            if(iterador.next().equalsIgnoreCase(aux)){
                iterador.remove();
                encontrado = true;
                break;
            }
        }

        if(!encontrado) System.out.println("El perro ingresado no existe");

        Collections.sort(perros);
        System.out.println(perros);

    }
}
