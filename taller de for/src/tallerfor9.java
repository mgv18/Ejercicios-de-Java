import java.util.Scanner;

public class tallerfor9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        long factorial = 1;

        System.out.print("Ingrese un número entero: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        System.out.println("El factorial de " + n + " es: " + factorial);
    }
}
