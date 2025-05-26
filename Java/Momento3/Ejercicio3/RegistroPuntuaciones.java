// Unica clase para el Reto 1
import java.util.Scanner;

public class RegistroPuntuaciones {
// Usaremos arrays de tamaño fijo para almacenar nombres y puntuaciones.
    // Suponemos un máximo de 5 puntuaciones altas.
    static final int MAX_PUNTUACIONES = 5;
    String[] nombresJugadores = new String[MAX_PUNTUACIONES];
    int[] puntuaciones = new int[MAX_PUNTUACIONES];
    int contadorActual = 0; // Para saber cuántas puntuaciones hemos

    // Método para agregar una nueva puntuación
    // No se preocupará por ordenarlas, solo por registrarlas si hay espacio.
    public void agregarPuntuacion(String nombre, int puntaje) {
        if (contadorActual < MAX_PUNTUACIONES) {
            nombresJugadores[contadorActual] = nombre;
            puntuaciones[contadorActual] = puntaje; // Error: Falta ; en la línea anterior
            contadorActual++; // Error: Falta ;
            System.out.println("Puntuación para " + nombre + " registrada.");
            } else {
            System.out.println("Registro lleno. No se pudo agregar la puntuación de " + nombre); // Error: 'nomre' en lugar de 'nombre'
        }
    }

    // Método para mostrar todas las puntuaciones registradas
    public void mostrarPuntuaciones() {
        System.out.println("\n--- Puntuaciones Más Altas ---");
        if (contadorActual == 0) {
            System.out.println("Aún no hay puntuaciones registradas.");
            return; // Error: Falta 'return;' si se quiere salir aquí, o quitar el return de agregarPuntuacion
        }
        for (int i = 0; i < contadorActual; i++) { // Error: Condición de bucle incorrecta (debería ser < contadorActual)
            System.out.println(nombresJugadores[i] + ": " + puntuaciones[i] + " puntos");
        }
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        RegistroPuntuaciones registro = new RegistroPuntuaciones();
        Scanner teclado = new Scanner(System.in);
        String opcionUsuario = "0"; // Error: debería ser String para comparar con "3"
    
        while (!opcionUsuario.equals("3")) {
            System.out.println("\nSistema de Puntuaciones Arcade");
            System.out.println("1. Agregar Puntuación");
            System.out.println("2. Mostrar Puntuaciones");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcionUsuario = teclado.nextLine();

            switch (opcionUsuario) {
                case "1":
                    System.out.print("Nombre del jugador: ");
                    String nombre = teclado.nextLine();
                    System.out.print("Puntaje obtenido: ");
                    int puntaje;
                    try {
                        puntaje = Integer.parseInt(teclado.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Puntaje inválido. Debe ser un número entero.");
                        break;
                    }
                    registro.agregarPuntuacion(nombre, puntaje);
                    break;
                case "2":
                    registro.mostrarPuntuaciones();
                    break;
                case "3":
                    System.out.println("¡Gracias por usar el sistema!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }

        teclado.close();
    }
}