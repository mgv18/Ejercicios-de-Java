import java.util.Scanner;

public class practica2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2;
        int suma, resta, multiplicacion;
        int division;
        System.out.println("digite un numero1");
        num1 = entrada.nextInt();
        System.out.println("digite un numero2");
        num2 = entrada.nextInt();

        suma = num1 + num2;
        System.out.println("La suma es: " + suma);

        resta = num1 - num2;
        System.out.println("La resta es: " + resta);

        division = num1 / num2;
        System.out.println("La division es: " + division);

        multiplicacion = num1 * num2;
        System.out.println("La multiplicacion es: " + multiplicacion);
    }
}
