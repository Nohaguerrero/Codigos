public class Validar_Contraseña {
 
    // Constante para la longitud mínima
    private static final int LONGITUD_MINIMA = 8;
 
    /**
     * Verifica si la contraseña tiene la longitud mínima requerida.
     * @param password La contraseña a verificar.
     * @return true si la longitud es válida, false en caso contrario.
     */
    public static boolean esLongitudValida(String password) {
        return password != null && password.length() >= LONGITUD_MINIMA;
    }
 
    /**
     * Verifica si la contraseña contiene al menos una letra mayúscula.
     * @param password La contraseña a verificar.
     * @return true si contiene una mayúscula, false en caso contrario.
     */
    public static boolean contieneMayuscula(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }
 
    /**
     * Verifica si la contraseña contiene al menos una letra minúscula.
     * @param password La contraseña a verificar.
     * @return true si contiene una minúscula, false en caso contrario.
     */
    public static boolean contieneMinuscula(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }
 
    /**
     * Verifica si la contraseña contiene al menos un dígito.
     * @param password La contraseña a verificar.
     * @return true si contiene un dígito, false en caso contrario.
     */
    public static boolean contieneDigito(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
 
    /**
     * Verifica si una contraseña es segura según todos los criterios.
     * @param password La contraseña a verificar.
     * @return true si la contraseña es segura, false en caso contrario.
     */
    public static boolean esContrasenaSegura(String password) {
        // TODO: Llamar a los métodos anteriores y combinar sus resultados
        return esLongitudValida(password) &&
               contieneMayuscula(password) &&
               contieneMinuscula(password) &&
               contieneDigito(password);
    }
 
    public static void main(String[] args) {
        String prueba1 = "clave123";
        String prueba2 = "ClaveSegura1";
        String prueba3 = "OTRAMAYUSCULA2";
 
        System.out.println("'" + prueba1 + "' es segura? " + esContrasenaSegura(prueba1));
        System.out.println("'" + prueba2 + "' es segura? " + esContrasenaSegura(prueba2));
        System.out.println("'" + prueba3 + "' es segura? " + esContrasenaSegura(prueba3));
 
        // TODO: Añade más pruebas
        String prueba4 = "pass";            
        String prueba5 = "Pass1234";        
        String prueba6 = "CONtrasena";    
 
        System.out.println("'" + prueba4 + "' es segura? " + esContrasenaSegura(prueba4));
        System.out.println("'" + prueba5 + "' es segura? " + esContrasenaSegura(prueba5));
        System.out.println("'" + prueba6 + "' es segura? " + esContrasenaSegura(prueba6));
    }
}
