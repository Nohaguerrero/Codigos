package Algoritmos;

import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aprobados = 0, reprobados = 0, calificacion;

        System.out.println("Ingrese las calificaciones de los estudiantes (entre 0 y 100). Ingresa -1 para finalizar:");

        while (true) {
            System.out.print("Calificación: ");
            calificacion = scanner.nextInt();

            if (calificacion == -1) {
                break;
            }
            if (calificacion >0 && calificacion <= 100) {
                if (calificacion >= 60) {
                    aprobados++;
                } else {
                    reprobados++;
                }
            } else {
                System.out.println("Calificación no válida. Debe estar entre 0 y 100.");
            }

    }
    System.out.println("Número de aprobados: " + aprobados);
    System.out.println("Número de reprobados: " + reprobados);

    scanner.close();
    }
}
