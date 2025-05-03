import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        int[] temperaturas = new int[7]; // Arreglo para almacenar las temperaturas de 7 días
        int temperaturaTotal = 0; // Variable para acumular la suma de las temperaturas

        // Solicita al usuario ingresar la temperatura de cada día
        System.out.println("Ingrese la temperatura de 7 días:");
        for (int i = 0; i < 7; i++) {
            System.out.print("Día " + (i + 1) + ": ");
            temperaturas[i] = scanner.nextInt(); // Guarda la temperatura ingresada en el arreglo
        }

        // Recorre las temperaturas para verificar si hay fiebre y sumarlas
        for (int i = 0; i < 7; i++) {
            if (temperaturas[i] > 38) {
                System.out.println("Alerta de fiebre en el día " + (i + 1)); // Alerta si la temperatura es mayor a 38
            }

            temperaturaTotal += temperaturas[i]; // Suma la temperatura al total
        }

        // Muestra la suma total de temperaturas
        System.out.println("La temperatura total es de: " + temperaturaTotal);

        scanner.close(); // Cierra el objeto Scanner
    }
}
