import java.util.Scanner;

public class SumaDiagonales4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.print("Ingrese el tamaño de la matriz (máximo 5): ");
            n = scanner.nextInt();
        } while (n > 5 || n < 1);  // Validación del tamaño

        int[][] matriz = new int[n][n];

        // Llenar la matriz con valores del usuario
        System.out.println("Ingrese los valores de la matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Calcular suma de la diagonal principal y secundaria
        int sumaPrincipal = 0;
        int sumaSecundaria = 0;

        for (int i = 0; i < n; i++) {
            sumaPrincipal += matriz[i][i];           // Diagonal principal: [i][i]
            sumaSecundaria += matriz[i][n - 1 - i];   // Diagonal secundaria: [i][n-1-i]
        }

        // Mostrar resultados
        System.out.println("Suma de la diagonal principal: " + sumaPrincipal);
        System.out.println("Suma de la diagonal secundaria: " + sumaSecundaria);

        scanner.close();
    }
}

