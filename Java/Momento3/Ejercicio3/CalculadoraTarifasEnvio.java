import java.util.Scanner;

public class CalculadoraTarifasEnvio {

    public static final double COSTO_BASE_LOCAL = 5000.0;
    public static final double COSTO_BASE_NACIONAL = 15000.0;
    public static final double COSTO_BASE_INTERNACIONAL = 50000.0;

    public static final double COSTO_ADICIONAL_POR_KG_LOCAL = 1000.0;
    public static final double COSTO_ADICIONAL_POR_KG_NACIONAL = 3000.0;
    public static final double COSTO_ADICIONAL_POR_KG_INTERNACIONAL = 10000.0;

    public static double calcularCostoAdicionalPorPeso(double pesoKg, int zona) {
        double costoAdicional = 0.0;
        if (pesoKg < 0) {
            return 0.0;
        }
        switch (zona) {
            case 1:
                costoAdicional = pesoKg * COSTO_ADICIONAL_POR_KG_LOCAL;
                break;
            case 2:
                costoAdicional = pesoKg * COSTO_ADICIONAL_POR_KG_NACIONAL;
                break;
            case 3:
                costoAdicional = pesoKg * COSTO_ADICIONAL_POR_KG_INTERNACIONAL;
                break;
            default:
                System.out.println("Advertencia: Zona no válida para costo adicional.");
                break;
        }
        return costoAdicional;
    }

    public static double obtenerCostoBasePorZona(int zona) {
        double costoBase = 0.0;
        switch (zona) {
            case 1:
                costoBase = COSTO_BASE_LOCAL;
                break;
            case 2:
                costoBase = COSTO_BASE_NACIONAL;
                break;
            case 3:
                costoBase = COSTO_BASE_INTERNACIONAL;
                break;
            default:
                System.out.println("Advertencia: Zona no válida para costo base.");
                break;
        }
        return costoBase;
    }

    public static double calcularTarifaTotal(double pesoKg, int zona) {
        double tarifaTotal = 0.0;
        double costoBase = obtenerCostoBasePorZona(zona);
        double costoAdicional = calcularCostoAdicionalPorPeso(pesoKg, zona);
        tarifaTotal = costoBase + costoAdicional;
        return tarifaTotal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Calculadora de Tarifas de Envío Logística Veloz S.A. ---");

        double pesoPaquete;
        do {
            System.out.print("Ingrese el peso del paquete en kilogramos (ej: 2.5): ");
            pesoPaquete = scanner.nextDouble();
            if (pesoPaquete <= 0) {
                System.out.println("Error: El peso debe ser un número positivo.");
            }
        } while (pesoPaquete <= 0);

        int zonaEnvio;
        do {
            System.out.println("Seleccione la zona de envío:");
            System.out.println("1. Local");
            System.out.println("2. Nacional");
            System.out.println("3. Internacional");
            System.out.print("Opción (1-3): ");
            zonaEnvio = scanner.nextInt();
            if (zonaEnvio < 1 || zonaEnvio > 3) {
                System.out.println("Error: Zona no válida. Intente de nuevo.");
            }
        } while (zonaEnvio < 1 || zonaEnvio > 3);

        double tarifaFinal = calcularTarifaTotal(pesoPaquete, zonaEnvio);
        System.out.println("\n--- Detalle del Envío ---");
        System.out.println("Peso del Paquete: " + pesoPaquete + " kg");

        String nombreZona = "";
        switch (zonaEnvio) {
            case 1: nombreZona = "Local"; break;
            case 2: nombreZona = "Nacional"; break;
            case 3: nombreZona = "Internacional"; break;
        }

        System.out.println("Zona de Destino: " + nombreZona);
        System.out.println("Tarifa Total de Envío: $" + String.format("%,.2f", tarifaFinal));
        System.out.println("---------------------------");

        scanner.close();
    }
}