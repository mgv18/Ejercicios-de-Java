import java.util.Scanner;

public class while6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero, suma = 0, promedio;
        int i = 1;
        while (i <= 10) {
            System.out.print("Ingrese el número " + i + ": ");
            numero = sc.nextDouble();

            suma = suma + numero;
            i++;
        }
        promedio = suma / 10;

        System.out.println("El promedio de los 10 números es: " + promedio);
    }
}
