import java.util.Scanner;

public class tallerfor3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;
        int suma = 0;
        System.out.print("Ingrese el valor de n: ");
        n = entrada.nextInt();
        for (int i = 1; i <= n; i++) {
            suma = suma + i;
        }

        System.out.println("La suma de los números naturales entre 1 y " + n + " es: " + suma);
    }
}
