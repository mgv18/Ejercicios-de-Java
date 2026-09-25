import java.util.Scanner;

public class tallercito5 {
    public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            System.out.print("Ingrese el primer número: ");
            int num1 = entrada.nextInt();

            System.out.print("Ingrese el segundo número: ");
            int num2 = entrada.nextInt();

            // Evaluamos las condiciones
            if (num1 > num2) {
                System.out.println("El número mayor es el primero: " + num1);
            } else if (num2 > num1) {
                System.out.println("El número mayor es el segundo: " + num2);
            } else {
                System.out.println("Los dos números son iguales (" + num1 + " y " + num2 + ").");
            }
    }
}
