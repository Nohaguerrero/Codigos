package Algoritmos;
import java.util.Scanner;


public class fibonaci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de términos de Fibonacci: ");
        int numeroDeTerminos = scanner.nextInt();
        int a = 0;
        int b = 1;
        int contador = 0;

        System.out.println("Serie de Fibonacci:");
        while (contador < numeroDeTerminos) {
            System.out.print(a + " ");
            int siguiente = a + b;
            a = b;
            b = siguiente;
            contador++;
        }

        scanner.close();
    }
}