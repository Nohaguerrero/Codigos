public class Calculadora_tienda {

    public static void main(String[] args) {
        System.out.println("--- Caso 1: Laptop (Electrónica), 1 unidad, No VIP ---");
        double precioLaptop1 = 1200.00;
        String categoriaLaptop1 = "electronica";
        int cantidadLaptop1 = 1;
        boolean esVIPLaptop1 = false;
        double precioFinalLaptop1 = CalculadoraDescuentosAvanzada.calcularPrecioFinal(precioLaptop1, categoriaLaptop1, cantidadLaptop1, esVIPLaptop1);
        System.out.println("Precio Original: $" + precioLaptop1 + ", Categoría: " + categoriaLaptop1 + ", Cant: " + cantidadLaptop1 + ", VIP: " + esVIPLaptop1);
        System.out.println("Precio Final Calculado: $" + String.format("%.2f", precioFinalLaptop1));
        System.out.println("---------------------------------------------------");

        System.out.println("--- Caso 2: Camisa (Ropa), 2 unidades, No VIP ---");
        double precioCamisa2 = 50.00;
        String categoriaCamisa2 = "ropa";
        int cantidadCamisa2 = 2;
        boolean esVIPCamisa2 = false;
        double precioFinalCamisa2 = CalculadoraDescuentosAvanzada.calcularPrecioFinal(precioCamisa2, categoriaCamisa2, cantidadCamisa2, esVIPCamisa2);
        System.out.println("Precio Original: $" + precioCamisa2 + ", Categoría: " + categoriaCamisa2 + ", Cant: " + cantidadCamisa2 + ", VIP: " + esVIPCamisa2);
        System.out.println("Precio Final Calculado: $" + String.format("%.2f", precioFinalCamisa2));
        System.out.println("---------------------------------------------------");

        System.out.println("--- Caso 3: Libro, 3 unidades, Cliente VIP ---");
        double precioLibro3 = 20.00;
        String categoriaLibro3 = "libros";
        int cantidadLibro3 = 3;
        boolean esVIPLibro3 = true;
        double precioFinalLibro3 = CalculadoraDescuentosAvanzada.calcularPrecioFinal(precioLibro3, categoriaLibro3, cantidadLibro3, esVIPLibro3);
        System.out.println("Precio Original: $" + precioLibro3 + ", Categoría: " + categoriaLibro3 + ", Cant: " + cantidadLibro3 + ", VIP: " + esVIPLibro3);
        System.out.println("Precio Final Calculado: $" + String.format("%.2f", precioFinalLibro3));
        System.out.println("---------------------------------------------------");

        System.out.println("--- Caso 4: Juguete (Otra categoría), 1 unidad, Cliente VIP ---");
        double precioJuguete4 = 30.00;
        String categoriaJuguete4 = "juguetes";
        int cantidadJuguete4 = 1;
        boolean esVIPJuguete4 = true;
        double precioFinalJuguete4 = CalculadoraDescuentosAvanzada.calcularPrecioFinal(precioJuguete4, categoriaJuguete4, cantidadJuguete4, esVIPJuguete4);
        System.out.println("Precio Original: $" + precioJuguete4 + ", Categoría: " + categoriaJuguete4 + ", Cant: " + cantidadJuguete4 + ", VIP: " + esVIPJuguete4);
        System.out.println("Precio Final Calculado: $" + String.format("%.2f", precioFinalJuguete4));
        System.out.println("---------------------------------------------------");
    }

    public static class CalculadoraDescuentosAvanzada {

        public static double obtenerPorcentajeDescuentoCategoria(String categoriaProducto) {
            if (categoriaProducto.equalsIgnoreCase("electronica")) {
                return 0.10;
            } else if (categoriaProducto.equalsIgnoreCase("ropa")) {
                return 0.20;
            } else if (categoriaProducto.equalsIgnoreCase("libros")) {
                return 0.05;
            } else {
                return 0.0;
            }
        }

        public static double obtenerPorcentajeDescuentoVolumen(int cantidad) {
            if (cantidad >= 3) {
                return 0.10;
            } else if (cantidad == 2) {
                return 0.05;
            } else {
                return 0.0;
            }
        }

        public static double obtenerPorcentajeDescuentoVIP(boolean esVIP) {
            return esVIP ? 0.07 : 0.0;
        }

        public static double calcularPrecioFinal(double precioOriginal, String categoriaProducto, int cantidad, boolean esVIP) {
            double descuentoCategoria = obtenerPorcentajeDescuentoCategoria(categoriaProducto);
            double precioConDescuentoCategoria = precioOriginal * (1 - descuentoCategoria);

            double descuentoVolumen = obtenerPorcentajeDescuentoVolumen(cantidad);
            double precioConDescuentoVolumen = precioConDescuentoCategoria * (1 - descuentoVolumen);

            double descuentoVIP = obtenerPorcentajeDescuentoVIP(esVIP);
            double precioFinal = precioConDescuentoVolumen * (1 - descuentoVIP);

            return precioFinal;
        }
    }
}
