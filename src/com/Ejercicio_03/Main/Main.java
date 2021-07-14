package com.Ejercicio_03.Main;

import com.Ejercicio_03.Alumno.Alumno;
import com.Ejercicio_03.Alumno.AlumnoService;

import java.util.ArrayList;
import java.util.Scanner;

/*Crear una clase llamada Alumno que mantenga información sobre las notas de
distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista
de tipo Integer con sus 3 notas. (done)
En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no. (done)
Despues de ese bluce tendremos el siguiente método en la clase Alumno:
Metodo notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular
su nota final y se lo busca en la lista de Alumnos.  Si está en la lista, se llama al
método. Dentro del método se usará la lista notas para calcular el promedio final
de alumno. Siendo este promedio final, devuelto por el método y mostrado en el
main. */
public class Main {
    public static void main(String[] args) {
        // scanner, string auxiliar, service
        Scanner sc = new Scanner(System.in);
        String aux;
        AlumnoService service = new AlumnoService();

        // Lista de alumnos
        ArrayList<Alumno> alumnos = new ArrayList<>();

        // Bucle que crea un alumno, lo completa y lo agrega a la lista
        do {
            Alumno alumno = new Alumno();
            service.crearAlumno(alumno);

            alumnos.add(alumno);

            System.out.println("Desea ingresar otro alumno? (s/n)");
            aux = sc.nextLine();

            while (!aux.equalsIgnoreCase("s") && !aux.equalsIgnoreCase("n")) {
                System.out.println("ERROR. Desea ingresar otro alumno (s/n)?");
                aux = sc.nextLine();
            }
        } while (!aux.equalsIgnoreCase("n"));

        // Alumno a buscar
        System.out.println("Ingrese el nombre del alumno para obtener su nota final:");
        aux = sc.nextLine();
        boolean encontrado = false;

        // Foreach para buscar el alumno
        for (Alumno alumno : alumnos) {
            if (aux.equalsIgnoreCase(alumno.getNombre())) {
                System.out.println("La nota final de " + alumno.getNombre() + " es: " + service.notaFinal(alumno));
                encontrado = true;
                break;
            }
        }

        if(!encontrado) System.out.println("El alumno no fue encontrado");
    }
}
