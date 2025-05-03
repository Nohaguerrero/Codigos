import java.util.Scanner;
public class AdicionFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int OpcUser = 0, numA = 0, numB = 0;
        boolean Key = true;

        do { 
            System.out.println("1. Sumar dos números\r\n" + //
                                "2. Restar dos números\r\n" + //
                                "3. Multiplicar dos números\r\n" + //
                                "4. Dividir dos números\r\n" + //
                                "5. Factorial de un número\r\n" + //
                                "6. Salir\r\n");
            System.out.print("Opcion seleccionada: ");
                    OpcUser = scanner.nextInt();

            switch (OpcUser) {
                case 1:
                    System.out.print("Ingrese numero A: ");
                    numA = scanner.nextInt();
                    System.out.print("Ingrese numero B: ");
                    numB = scanner.nextInt();

                    System.out.println(numA + " + " + numB +" = " +(numA+numB));


                    break;
                case 2:
                    System.out.print("Ingrese numero A: ");
                numA = scanner.nextInt();
                    System.out.print("Ingrese numero B: ");
                numB = scanner.nextInt();

                    System.out.println(numA + " - " + numB +" = " +(numA-numB));


                    break;
                case 3:
                    System.out.print("Ingrese numero A: ");
                numA = scanner.nextInt();
                    System.out.print("Ingrese numero B: ");
                numB = scanner.nextInt();

                    System.out.println(numA + " * " + numB +" = " +(numA*numB));

                break;
                case 4:
                    System.out.print("Ingrese numero A: ");
                numA = scanner.nextInt();
                    System.out.print("Ingrese numero B: ");
                numB = scanner.nextInt();

                System.out.println(numA + " / " + numB +" = " +(numA/numB));

                break;
                case 5:
                    System.out.print("Ingrese numero A: ");
                numA = scanner.nextInt();
                long factorial = 1;
                int i = 1;
                while (i <= numA) {
                    factorial *= i;
                    i++;
                }
                System.out.println("El factorial de " + numA + " es: " + factorial);

                break;
                case 6:
                    Key = false;
                    System.out.print("Gracias, hasta pronto!");

                break;   
                default:
                    System.out.print("Opcion no valida!");
                break;
            }
        } while (Key);

        scanner.close();
    }
}
