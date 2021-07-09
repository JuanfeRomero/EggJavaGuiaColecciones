package com.Ejercicio_05.Main;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/*
* Se requiere un programa que lea y guarde países,
* y para evitar que se ingresen repetidos  usaremos  un  conjunto.
* El  programa  pedirá  un  país  en  un  bucle,  se guardará  el  país  en  el  conjunto  y
* después  se  le  preguntará  al  usuario  si  quiere guardar  otro  país  o  si  quiere  salir, (done)
* si  decide  salir,  se  mostrará  todos  los  países guardados en el conjunto. (done)
* Después  deberemos  mostrar  el  conjunto  ordenado  alfabéticamente  para  esto
recordar como se ordena un conjunto. (es un treeset)
Y  por  ultimo,  al  usuario  se  le  pedirá  un  país  y  se  recorrerá  el  conjunto  con  un
Iterator, se buscará el país en el conjunto y si está en el conjunto se eliminará el
país que ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra
en el conjunto se le informará al usuario. (done)
* */
public class Main {
    public static void main(String[] args) {
        // Scanner y auxiliar para leer
        Scanner sc = new Scanner(System.in);
        String aux;

        // Lista de paises
        TreeSet<String> paises = new TreeSet<>();

        // Bucle que pide paises
        do{
            System.out.println("Ingrese un país: ");
            paises.add(sc.nextLine());

            System.out.println("Quiere seguir agregando paises? (s/n)");
            aux = sc.nextLine();

            // en caso de que no escriba "S" ni "N"
            while(!aux.equalsIgnoreCase("s") && !aux.equalsIgnoreCase("n")){
                System.out.println("Error, Quiere seguir agregando paises (s/n)");
                aux = sc.nextLine();
            }
        }while(aux.equalsIgnoreCase("s"));

        // mostrar todos los paises
        System.out.println(paises);

        // conseguir pais a buscar
        System.out.println("Ingrese un pais para buscar");
        aux = sc.nextLine();

        // iterador con boolean para chequear si no se encuentra en la lista
        boolean encontrado = false;
        Iterator<String> iterador = paises.iterator();

        // bucle para buscar el pais y eliminarlo, si no lo encuentra imprime que no está.
        while (iterador.hasNext()){
            if(iterador.next().equalsIgnoreCase(aux)){
                System.out.println("Pais eliminado");
                iterador.remove();
                encontrado = true;
                break;
            }
        }

        if(!encontrado) System.out.println("El pais ingresado no se encuentra en el conjunto");


        // mostrar que siga igual o que tenga uno eliminado
        System.out.println(paises);

    }
}
