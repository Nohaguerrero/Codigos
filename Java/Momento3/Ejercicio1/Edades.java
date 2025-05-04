import java.util.Scanner;

public class Edades {
        public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Intrucciones();
        Edad(scanner);
        scanner.close();
    };

    public static void Intrucciones(){
        System.out.println("=== Clasificador de Edades ===");
        System.out.println("Ingresa edades una por una.");
        System.out.println("El programa dirá si la persona es 'Menor de edad' o 'Mayor de edad'.");
        System.out.println("Para terminar, escribe 0.");
    }
    public static void Edad (Scanner scanner){
        int años;

        while (true) {
            System.out.print("Introduce la edad: "); 
            años = scanner.nextInt();
            
        if (años == 0){
            System.out.println("Programa finalizado");
            break;
        }
        if (años > 18){
        System.out.println("Es mayor de edad");
        }else{
        System.out.println("Es menor de edad");
        } 
    }
}
}