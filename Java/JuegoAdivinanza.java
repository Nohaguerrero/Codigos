package Algoritmos;
import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanza {
                public static void main(String[] args) {
                    Scanner scanner = new Scanner(System.in);
                    Random random = new Random();

            int numeroOculto = random.nextInt(20) + 1; 
            int intentos = 0, numeroUsuario = 0;

            System.out.println("¡Bienvenido al juego de adivinanza!");
            System.out.println("Estoy pensando en un número entre 1 y 20. ¡Intenta adivinarlo!");

            do {System.out.print("Ingresa tu numero: ");
                numeroUsuario = scanner.nextInt();
                intentos++;

                if (numeroUsuario > numeroOculto) {
                    System.out.println("El numero es Mayor que el numero oculto. Intenta de nuevo.");
                }else if (numeroUsuario < numeroOculto) {
                        System.out.println("El numero es Menor que el numero oculto. Intenta de nuevo.");
                    } else {
                        System.out.println("Felicidades " + numeroUsuario + " es el numero oculto. Lo adivinaste en " 
                        + intentos + " intentos.");
                    }
                } while (numeroUsuario != numeroOculto);
                System.out.println("¿Quieres jugar de nuevo? (s/n)");
                String respuesta = scanner.next();
                if (respuesta.equalsIgnoreCase("s")) { 
                    main(args);
                } else {
                    System.out.println("Gracias por jugar. ¡Hasta luego!");
                    scanner.close();
                    }
            }
}
