package com.Ejercicio_04.Pelicula;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class PeliculaService {
    public void crearPelicula(Pelicula peli) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el titulo de la pelicula:");
        peli.setTitulo(sc.nextLine());

        System.out.println("Ingrese el director de la pelicula:");
        peli.setDirector(sc.nextLine());

        // Lo estoy haciendo en minutos porque no tiene sentido hacerlo en horas
        System.out.println("Ingrese la duracion de la pelicula (en minutos)");
        peli.setDuracion(sc.nextInt());
    }

    public Pelicula crearPelicula(){
        Scanner sc = new Scanner(System.in);
        Pelicula peli = new Pelicula();
        System.out.println("Ingrese el titulo de la pelicula:");
        peli.setTitulo(sc.nextLine());

        System.out.println("Ingrese el director de la pelicula:");
        peli.setDirector(sc.nextLine());

        // Lo estoy haciendo en minutos porque no tiene sentido hacerlo en horas
        System.out.println("Ingrese la duracion de la pelicula (en minutos)");
        peli.setDuracion(sc.nextInt());

        return peli;
    }

    public void mostrarPeliculas(ArrayList<Pelicula> pelis) {
        System.out.println("Todas las peliculas:");
        System.out.println(pelis);
        System.out.println();
    }

    public void mostrarDuraMasUnaHora(ArrayList<Pelicula> pelis) {
        System.out.println("Estas Peliculas duran mas de una hora");
        for (Pelicula peli : pelis) {
            if(peli.getDuracion() >= 60){
                System.out.println(peli);
            }
        }
        System.out.println();
    }

    public void ordernarPorDuracionAsc(ArrayList<Pelicula> pelis){
        System.out.println("Peliculas ordenadas por duracion ascendente");
        pelis.sort(ordenadorAsc);
        System.out.println(pelis);
        System.out.println();
    }

    public static Comparator<Pelicula> ordenadorAsc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getDuracion() - o2.getDuracion();
        }
    };

    public void ordernarPorDuracionDsc(ArrayList<Pelicula> pelis){
        System.out.println("Peliculas ordenadas por duracion descendente");
        pelis.sort(ordenadorDsc);
        System.out.println(pelis);
        System.out.println();
    }

    public static Comparator<Pelicula> ordenadorDsc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula a, Pelicula b){
            return b.getDuracion() - a.getDuracion();
        }
    };

    public void ordenarPorTitulo(ArrayList<Pelicula> pelis){
        System.out.println("Peliculas ordenadas alfabeticamente por titulo");
        pelis.sort(ordenadorTitulo);
        System.out.println(pelis);
    }

    public static Comparator<Pelicula> ordenadorTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula a, Pelicula b){
            return a.getTitulo().compareToIgnoreCase(b.getTitulo());
        }
    };

    public void ordenarPorDirector(ArrayList<Pelicula> pelis){
        System.out.println("Peliculas ordenadas alfabeticamente por director");
        pelis.sort(ordenadorDirector);
        System.out.println(pelis);
    }

    public static Comparator<Pelicula> ordenadorDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula a, Pelicula b){
            return a.getDirector().compareToIgnoreCase(b.getDirector());
        }
    };
}