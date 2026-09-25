import java.util.Scanner;

public class tallercito3 {
    public static void main(String[] args) {
        System.out.print("Ingrese un número: ");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        if (numero % 5 == 0) {
            System.out.println("El número es divisible entre 5.");
        } else {
            System.out.println("El número no es divisible entre 5.");
        }
    }
}
