package Algoritmos;
import java.util.Scanner;

public class EvaluaEdades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad, contadorMenores = 0, contadorMayores = 0;

        System.out.println("Ingrese la edad de las personas, para terminar ingresa un numero negativo: ");

        while (true) {
            System.out.print("Edad: ");
            edad = scanner.nextInt();

            if (edad < 0) {
                break;
            }
                if (edad < 18) {
                    contadorMenores++;
                    } else {
                    contadorMayores++;
                    }
            }
        
        System.out.println("Número de personas menores de edad: " + contadorMenores);  
        System.out.println("Número de personas mayores de edad: " + contadorMayores);
        
        scanner.close();
}
}
