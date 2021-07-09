package com.Ejercicio_04.Main;

import com.Ejercicio_04.Pelicula.Pelicula;
import com.Ejercicio_04.Pelicula.PeliculaService;

import java.util.ArrayList;
import java.util.Scanner;

/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas.
Para  esto,  tendremos  una  clase  Pelicula  con  el  titulo,  director  y  duración  de  la
película  (en  horas). (done)
Implemente  las  clases  y  métodos  necesarios  para  esta situación, (done)
teniendo en cuenta lo que se pide a continuación:
En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al
usuario todos sus datos y guardándolos en el objeto Pelicula. (done)
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario
si quiere crear otra Pelicula o no. (done)
Después de ese bucle realizaremos las siguientes acciones:
•Mostrar en pantalla todas las películas. (done)
•Mostrar en pantalla todas las películas con una duración mayor a 1 hora. (done)
•Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
en pantalla. (done)
•Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
en pantalla.(done)
•Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla. (done)
•Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla. (done)
Nota: recordar el uso del Comparator para ordenar colecciones con objetos.
* */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String aux;
        PeliculaService service = new PeliculaService();

        ArrayList<Pelicula> peliculas = new ArrayList<>();

        do{
//            Pelicula pelicula = new Pelicula();
//            service.crearPelicula(pelicula);
            Pelicula pelicula = service.crearPelicula();

            peliculas.add(pelicula);

            System.out.println("Desea ingresar otra pelicula? (s/n)");
            aux = sc.nextLine();

            while (!aux.equalsIgnoreCase("s") && !aux.equalsIgnoreCase("n")) {
                System.out.println("ERROR. Desea ingresar otra pelicula (s/n)?");
                aux = sc.nextLine();
            }
        }while(aux.equalsIgnoreCase("s"));

        service.mostrarPeliculas(peliculas);

        service.mostrarDuraMasUnaHora(peliculas);

        service.ordernarPorDuracionAsc(peliculas);

        service.ordernarPorDuracionDsc(peliculas);

        service.ordenarPorTitulo(peliculas);

        service.ordenarPorDirector(peliculas);
    }
}
