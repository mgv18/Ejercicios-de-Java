import java.util.Scanner;

public class tallerfor4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m, n, suma = 0;
        System.out.print("Ingrese el valor de m: ");
        m = sc.nextInt();

        System.out.print("Ingrese el valor de n: ");
        n = sc.nextInt();

        for (int i = m; i <= n; i++) {
            suma = suma + i;
        }

        System.out.println("La suma de los números entre " + m + " y " + n + " es: " + suma);
    }
}
