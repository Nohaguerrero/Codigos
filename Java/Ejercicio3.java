import java.util.Scanner; // Importa la clase Scanner para leer entradas por teclado

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner para la entrada de datos

        char[] letras = new char[10]; // Arreglo para almacenar 10 letras
        int contadorVocales = 0; // Contador para las vocales encontradas

        // Ingreso de cada carácter individual
        System.out.println("Ingrese 10 letras (una por una):");
        for (int i = 0; i < 10; i++) {
            System.out.print("Letra " + (i + 1) + ": ");
            letras[i] = scanner.next().charAt(0); // Toma solo el primer carácter ingresado
        }

        // Revisión de vocales
        for (int i = 0; i < letras.length; i++) {
            char c = letras[i];

            // Verifica si la letra es una vocal (mayúscula o minúscula)
            if ("aeiouAEIOU".indexOf(c) != -1) {
                contadorVocales++; // Aumenta el contador de vocales
            }
        }

        // Muestra el total de vocales encontradas
        System.out.println("Cantidad total de vocales: " + contadorVocales);

        scanner.close(); // Cierra el Scanner
    }
}