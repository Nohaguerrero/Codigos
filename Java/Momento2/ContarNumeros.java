package Algoritmos;
import java.util.Scanner;
public class ContarNumeros {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int pares = 0, impares = 0;
            
            for (int n = 1; n <= 10; n++) {
                System.out.print( "Ingrse 10 numero para definirlos como pares o impares: ");
                int numero = scanner.nextInt();

                if (numero % 2 == 0) {
                    pares++;
                    
                }else {impares++;
                    }
                }            
            System.out.println("Total de números pares: " + pares);
            System.out.println("Total de números impares: " + impares);

            System.out.println("¿Quieres jugar de nuevo? (s/n)");
            String respuesta = scanner.next();
            if (respuesta.equalsIgnoreCase("s")) { 
                main(args);
            } else {
                System.out.println("Gracias por jugar. ¡Hasta luego!");
            }
            scanner.close();
}
}

// El codigo solo me exige 10 numeros, y terminar el juego pero me parece que no es correcto, 
//ya que un juego debe permitir jugar de nuevo.

// estaba haciendo algo mal y era y era hacer que en el if fuera el contador y no la variable numero, que es la que guarda los numeros
// ingresados por el usuario.