import java.util.Scanner;

public class practica6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero, valorAbsoluto;
        System.out.print("Ingrese un número real: ");
        numero = entrada.nextDouble();

        //Math.abs() convierte un número negativo en positivo.

        valorAbsoluto = Math.abs(numero);
        System.out.println("El valor absoluto es: " + valorAbsoluto);
    }
}
