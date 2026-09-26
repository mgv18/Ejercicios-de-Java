import java.util.Scanner;

public class practica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int edad, años;
        System.out.print("Ingrese su edad: ");
        edad = entrada.nextInt();
        System.out.print("¿Dentro de cuántos años desea saber su edad?: ");
        años = entrada.nextInt();
        int edadFutura = edad + años;
        System.out.println("Dentro de " + años + " años tendrá " + edadFutura + " años.");
    }
    }



