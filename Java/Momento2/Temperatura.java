
import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {
        // Crear un array para almacenar las temperaturas de 30 días
        double[] temperaturas = new double[30];
        Scanner scanner = new Scanner(System.in);

        // Solicitar las temperaturas al usuario
        for (int i = 0; i < 30; i++) {
            System.out.print("Ingrese la temperatura máxima del día " + (i + 1) + ": ");
            temperaturas[i] = scanner.nextDouble();
        }

        // Variables para los cálculos
        double maxTemp = temperaturas[0];  // Asumir que el primer valor es el máximo inicial
        double minTemp = temperaturas[0];  // Asumir que el primer valor es el mínimo inicial
        double sumaTemperaturas = 0;
        int diasCalidos = 0;

        // Ciclo para calcular máximo, mínimo, promedio y contar días calidos
        for (int i = 0; i < 30; i++) {
            // Calcular máximo
            if (temperaturas[i] > maxTemp) {
                maxTemp = temperaturas[i];
            }

            // Calcular mínimo
            if (temperaturas[i] < minTemp) {
                minTemp = temperaturas[i];
            }

            // Sumar todas las temperaturas para calcular el promedio
            sumaTemperaturas += temperaturas[i];

            // Contar días con temperaturas superiores a 25°C
            if (temperaturas[i] > 25) {
                diasCalidos++;
            }
        }

        // Calcular promedio
        double promedio = sumaTemperaturas / 30;

        // Mostrar resultados
        System.out.println("\nResultados:");
        System.out.println("Temperatura máxima del mes: " + maxTemp + "°C");
        System.out.println("Temperatura mínima del mes: " + minTemp + "°C");
        System.out.println("Temperatura promedio del mes: " + promedio + "°C");
        System.out.println("Días con temperaturas superiores a 25°C: " + diasCalidos);
    }
}