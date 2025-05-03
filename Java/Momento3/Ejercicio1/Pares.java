import java.util.Scanner;

public class Pares {
            public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Intrucciones();
        Pares(scanner);
        scanner.close();
        }

        
    public static void Intrucciones(){
        System.out.println("=== Mostrar Números Pares del 1 al 20 ===");
        System.out.println("Este programa imprimirá todos los números pares entre 1 y 20.");
    }

    public static void Pares (Scanner scanner){

    for(int i = 1; i < 22; i++){
        if(i % 2 == 0){
            System.out.println(i);
        }
    }
}
}