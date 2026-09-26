import java.util.Scanner;

public class practica5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double lado, volumen;
        System.out.print("Ingrese el lado del cubo: ");
        lado = entrada.nextDouble();
        volumen = lado * lado * lado;
        System.out.println("El volumen del cubo es: " + volumen);
    }
}
