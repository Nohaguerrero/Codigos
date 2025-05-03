import java.util.Scanner;

        public class MatrizCalculoPromedio {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                final int ESTUDIANTES = 3;
                final int ASIGNATURAS = 4;
                
                double[][] notas = new double[ESTUDIANTES][ASIGNATURAS];
        
                // Solicitar al usuario las notas
                for (int i = 0; i < ESTUDIANTES; i++) {
                    System.out.println("Ingrese las notas del estudiante " + (i + 1) + ":");
                    for (int j = 0; j < ASIGNATURAS; j++) {
                        System.out.print("  Nota de la asignatura " + (j + 1) + ": ");
                        notas[i][j] = scanner.nextDouble();
                    }
                }
                        // Calcular y mostrar el promedio de cada estudiante
        System.out.println("\n--- Promedios ---");
        for (int i = 0; i < ESTUDIANTES; i++) {
            double suma = 0;
            for (int j = 0; j < ASIGNATURAS; j++) {
                suma += notas[i][j];
            }
            double promedio = suma / ASIGNATURAS;
            System.out.println("Estudiante " + (i + 1) + ": " + promedio);
        }
        
        scanner.close();
    }
}
