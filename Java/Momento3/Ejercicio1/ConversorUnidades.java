import java.util.Scanner;

public class ConversorUnidades {

    public static void metrosACentimetros() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de metros: ");
        double metros = scanner.nextDouble();
        double centimetros = metros * 100;
        System.out.println(metros + " metros equivalen a " + centimetros + " centímetros.");
    }

    public static void kilometrosAMetros() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de kilómetros: ");
        double kilometros = scanner.nextDouble();
        double metros = kilometros * 1000;
        System.out.println(kilometros + " kilómetros equivalen a " + metros + " metros.");
    }

    public static void celsiusAFahrenheit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(celsius + "°C equivalen a " + fahrenheit + "°F.");
    }


    public static void fahrenheitACelsius() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la temperatura en grados Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + "°F equivalen a " + celsius + "°C.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {

            System.out.println("\n--- Conversor de Unidades ---");
            System.out.println("1. Metros a centímetros");
            System.out.println("2. Kilómetros a metros");
            System.out.println("3. Celsius a Fahrenheit");
            System.out.println("4. Fahrenheit a Celsius");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    metrosACentimetros();
                    break;
                case 2:
                    kilometrosAMetros();
                    break;
                case 3:
                    celsiusAFahrenheit();
                    break;
                case 4:
                    fahrenheitACelsius();
                    break;
                case 5:
                    System.out.println("Gracias por usar el conversor. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 5);
    }
}
