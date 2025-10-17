// CalculadoraBasica.java
import java.util.Scanner;

public class CalculadoraBasica {

    // Lee un número double desde la entrada, repitiendo hasta que sea válido
    private static double leerDouble(Scanner sc, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String linea = sc.nextLine().trim();
            try {
                // Usamos Double.parseDouble para evitar problemas con Scanner.nextDouble y locale
                return Double.parseDouble(linea);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor ingrese un número (ej: 3.5 o 2).");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = leerDouble(sc, "Ingrese el primer número: ");
        double b = leerDouble(sc, "Ingrese el segundo número: ");

        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));

        if (b != 0) {
            System.out.println("División: " + (a / b));
        } else {
            System.out.println("División: No se puede dividir entre cero.");
        }

        sc.close();
    }
}

