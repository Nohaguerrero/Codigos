import java.util.Random;
import java.util.Scanner;

public class Adivinar {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Intrucciones();
        adivinarNumero(scanner);
        scanner.close();
    };
    public static void Intrucciones(){
        System.out.println("Adivina el numero que tiene la aplicacion, ingresa cuantas veces sea necesario hasta que adivines");
    }
    public static void adivinarNumero(Scanner scanner) {
        Random random = new Random();
        int numeroSecreto = random.nextInt(10)+1;
        int intento;
        int intentos = 0;
        
        while(true){
            System.out.print("Introduce tu intento (entre 1 a 10)");
            intento = scanner.nextInt();
            intentos++;

            if(intento < numeroSecreto){
                System.out.println("El numero es mayor, sigue intentando");
            } else if (intento > numeroSecreto){
                System.out.println("El numero es menor, sigue intentando");
            }else{
            System.out.println("Felicidades adivinaste el numero en " + intentos + " intentos");
            break;
            }
        }
    }    
}
