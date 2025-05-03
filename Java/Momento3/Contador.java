import java.util.Scanner;

public class Contador{
    public static void main(String[] args) {
        Intrucciones();
        Scanner scanner = new Scanner(System.in);
        int conteo = Numerador(scanner);

        System.out.println("la cantidad de numeros positivos ingresados es: " + conteo);

        scanner.close();
    }

    public static void Intrucciones() {
        System.out.println("Ingresaras tantos numeros positivos como quieras y al final sabras cuantos numeros positivos ingrsaste, para terminar ingresa un numero negativo");
    
    }


public static int Numerador(Scanner scanner) {
    int numero;
    int Contador = 0;

        while(true){
            System.out.print("Ingrese un numero, (para terminar un numero negativo): ");
            numero = scanner.nextInt();

            if (numero > 0)
            Contador++;
            else if (numero < 0)
            break;
        }
        return Contador;


    }

}

