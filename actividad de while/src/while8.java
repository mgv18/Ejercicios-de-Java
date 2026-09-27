import java.util.Scanner;

public class while8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int i = 1;
        int suma = 0;
        System.out.print("Ingrese el valor de n: ");
        n = sc.nextInt();
        while (i <= n) {
            suma = suma + (i * i);
            i++;
        }
        System.out.println("La suma de los cuadrados entre 1 y " + n + " es: " + suma);
    }
}
