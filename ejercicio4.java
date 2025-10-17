public class Promedio {
    public static void main(String[] args) {
        int suma = 0;

        // Recorremos los números del 1 al 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            suma += i; // Acumulamos la suma
        }

        // Calculamos el promedio (dividimos por 10.0 para obtener un resultado decimal)
        System.out.println("Promedio: " + (suma / 10.0));
    }
}
