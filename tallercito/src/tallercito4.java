import java.util.Scanner;

public class tallercito4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un número entre 1 y 15: ");
        int numero = entrada.nextInt();
        if (numero < 1 || numero > 15) {
            System.out.println("El número está fuera del rango permitido (1 a 15).");
        } else {
            boolean esPrimo = true;

            if (numero == 1) {
                esPrimo = false;
            } else {
                for (int i = 2; i <= numero / 2; i++) {
                    if (numero % i == 0) {
                        esPrimo = false;
                        break;
                    }
                }
                if (esPrimo) {
                    System.out.println("El número " + numero + " es primo.");
                } else {
                    System.out.println("El número " + numero + " NO es primo.");
                }
            }
        }
    }
}
