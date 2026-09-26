import java.util.Scanner;

public class practica4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la base del triángulo: ");
        double base = entrada.nextDouble();
        System.out.print("Ingrese la altura del triángulo: ");
        double altura = entrada.nextDouble();
            // Aplicamos la fórmula del área: (base * altura) / 2
            double area = (base * altura) / 2.0;
            System.out.println("Base: " + base);
            System.out.println("Altura: " + altura);
            System.out.println("El área del triángulo es: " + area);
        }
    }

