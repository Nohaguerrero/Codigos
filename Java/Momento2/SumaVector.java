import java.util.Scanner;

public class SumaVector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de números a sumar: ");
        int [] tamaño = new int[6];
        int cantidad = scanner.nextInt();
        int[] vector = new int[cantidad];
        
        int suma = 0;
        
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            vector[i] = scanner.nextInt();
            suma += vector[i];
        }
        
        System.out.println("La suma de los elementos del vector es: " + suma);
        
        scanner.close();
    }
}
