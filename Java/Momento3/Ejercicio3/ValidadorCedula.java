import java.util.Scanner;

public class ValidadorCedula {

    // Método que verifica si un solo carácter es un dígito
    public static boolean esDigito(char caracter) {
        return caracter >= '0' && caracter <= '9';
    }

    // Método que valida todo el número de cédula
    public static boolean esFormatoCedulaValido(String numeroCedula) {
        // Verificar longitud exacta
        if (numeroCedula.length() != 10) {
            System.out.println("Error: La cédula debe tener exactamente 10 caracteres.");
            return false;
        }

        // Verificar que el primer carácter no sea '0'
        if (numeroCedula.charAt(0) == '0') {
            System.out.println("Error: La cédula no debe comenzar con 0.");
            return false;
        }

        // Verificar que todos los caracteres sean dígitos
        for (int i = 0; i < numeroCedula.length(); i++) {
            char c = numeroCedula.charAt(i);
            if (!esDigito(c)) {
                System.out.println("Error: La cédula contiene caracteres no numéricos.");
                return false;
            }
        }

        // Si pasa todas las condiciones
        return true;
    }

    // Método principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String respuesta;

        System.out.println("=== Sistema Validador de Formato de Cédulas ===");

        do {
            System.out.print("Ingrese el número de cédula a validar: ");
            String cedula = scanner.nextLine();

            boolean esValida = esFormatoCedulaValido(cedula);

            if (esValida) {
                System.out.println("Formato de Cédula VÁLIDO.");
            } else {
                System.out.println("Formato de Cédula INVÁLIDO.");
            }

            System.out.print("¿Desea validar otra cédula? (S/N): ");
            respuesta = scanner.nextLine();

        } while (respuesta.equalsIgnoreCase("s"));

        System.out.println("Gracias por usar el sistema.");
        scanner.close();
    }
}
