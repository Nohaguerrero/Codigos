import java.util.Scanner;

public class CalculadoraAreas {

    public static void areaCuadrado() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el lado del cuadrado: ");
        double lado = scanner.nextDouble();
        double area = lado * lado;
        System.out.println("El área del cuadrado es: " + area);
    }

    public static void areaRectangulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la base del rectángulo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingresa la altura del rectángulo: ");
        double altura = scanner.nextDouble();
        double area = base * altura;
        System.out.println("El área del rectángulo es: " + area);
    }

    public static void areaTriangulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la base del triángulo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingresa la altura del triángulo: ");
        double altura = scanner.nextDouble();
        double area = (base * altura) / 2;
        System.out.println("El área del triángulo es: " + area);
    }

    public static void areaCirculo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el radio del círculo: ");
        double radio = scanner.nextDouble();
        double area = Math.PI * radio * radio;
        System.out.println("El área del círculo es: " + area);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {

            System.out.println("\n--- Calculadora de Áreas ---");
            System.out.println("1. Cuadrado");
            System.out.println("2. Rectángulo");
            System.out.println("3. Triángulo");
            System.out.println("4. Círculo");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    areaCuadrado();
                    break;
                case 2:
                    areaRectangulo();
                    break;
                case 3:
                    areaTriangulo();
                    break;
                case 4:
                    areaCirculo();
                    break;
                case 5:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 5);
    }
}
