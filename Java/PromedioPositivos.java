package Algoritmos;

import java.util.Scanner;

public class PromedioPositivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0, suma = 0, contador = 0;

        System.out.println("Ingrese números enteros positivos (ingrese 0 para terminar): ");

    do {
        System.out.print("Número: ");
        numero = scanner.nextInt();

        if (numero > 0) {
            suma += numero;
            contador++;
        }

    } while (numero != 0);    
    
            if (contador > 0) {
                double promedio = (double) suma / contador;
                System.out.println("El promedio de los números positivos ingresados es: " + promedio);
            } else {
                System.out.println("No se ingresaron números positivos.");
            }
    
            scanner.close();
        }
}
