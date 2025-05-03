/** 🧩 Ejercicio 1: Encuentra el valor máximo y su posición en un vector
Enunciado: Solicita al usuario ingresar 8 números enteros en un vector. Luego, recorre el vector para encontrar el número mayor y muestra también su posición dentro del vector.
Temas aplicados:
● Vectores
● Ciclos for
● Condicionales if
● Uso de índices**/

import java.util.Scanner;

public class MaximoEnVector1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[8];

        System.out.println("Ingrese 8 números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        int maximo = numeros[0];
        int posicion = 0;

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
                posicion = i;
            }
        }

        System.out.println("El número mayor es: " + maximo);
        System.out.println("Se encuentra en la posición: " + posicion);

        scanner.close();
    }
}

