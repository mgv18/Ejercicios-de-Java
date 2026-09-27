import java.util.Scanner;

public class while7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero;
        double suma = 0;
        double promedio;
        int cantidad = 0;
        System.out.print("Ingrese un número (0 para terminar): ");
        numero = sc.nextDouble();
        while (numero != 0) {
            suma = suma + numero;
            cantidad++;

            System.out.print("Ingrese otro número (0 para terminar): ");
            numero = sc.nextDouble();
        }

        if (cantidad > 0) {
            promedio = suma / cantidad;
            System.out.println("El promedio es: " + promedio);
        } else {
            System.out.println("No se ingresaron números.");
        }
        }
}
