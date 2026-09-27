import java.util.Scanner;

public class tallerfor6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double numero, suma = 0, promedio;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            numero = sc.nextDouble();

            suma = suma + numero;
        }

        promedio = suma / 5;

        System.out.println("El promedio es: " + promedio);
    }
}
