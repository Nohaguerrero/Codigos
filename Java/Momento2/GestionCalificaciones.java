import java.util.Scanner;

public class GestionCalificaciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Pedir el número de estudiantes
        System.out.print("Ingrese el número de estudiantes: ");
        int numEstudiantes = scanner.nextInt();

        // 2. Crear una matriz para guardar las calificaciones [filas = estudiantes][columnas = exámenes]
        double[][] calificaciones = new double[numEstudiantes][3];

        // Pedir calificaciones para cada estudiante
        for (int i = 0; i < numEstudiantes; i++) {
            System.out.println("Estudiante #" + (i + 1));
            for (int j = 0; j < 3; j++) {
                System.out.print("  Ingrese calificación del examen " + (j + 1) + ": ");
                calificaciones[i][j] = scanner.nextDouble();
            }
        }

        // 3. Calcular promedio final de cada estudiante
        double[] promedios = new double[numEstudiantes];

        for (int i = 0; i < numEstudiantes; i++) {
            double suma = 0;
            for (int j = 0; j < 3; j++) {
                suma += calificaciones[i][j];
            }
            promedios[i] = suma / 3;
        }

        // 4. Contar cuántos aprobaron y cuántos reprobaron (promedio >= 6.0)
        int aprobados = 0;
        int reprobados = 0;

        for (int i = 0; i < numEstudiantes; i++) {
            if (promedios[i] >= 6.0) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        // 5. Mostrar matrícula (índice) y promedio final de cada estudiante
        System.out.println("\nResultados:");
        for (int i = 0; i < numEstudiantes; i++) {
            System.out.printf("Estudiante #%d → Promedio final: %.2f%n", (i + 1), promedios[i]);
        }

        // Mostrar cantidad de aprobados y reprobados
        System.out.println("\nResumen:");
        System.out.println("Estudiantes aprobados: " + aprobados);
        System.out.println("Estudiantes reprobados: " + reprobados);
    }
}
