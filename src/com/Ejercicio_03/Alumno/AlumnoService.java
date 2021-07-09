package com.Ejercicio_03.Alumno;

import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoService {
    public void crearAlumno(Alumno alumno){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese el nombre del alumno");
        alumno.setNombre(sc.nextLine());

        ArrayList<Integer> notas = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.printf("Ingrese la %d° nota\n", i+1);
            notas.add(sc.nextInt());
        }
        System.out.println(notas);

        alumno.setNotas(notas);
    }

    public int notaFinal(Alumno alumno){
        int notaFinal = 0;

        System.out.println(alumno.getNotas());
        for (Integer nota: alumno.getNotas()
             ) {
            notaFinal += nota;
        }

        return notaFinal/3;
    }
}
