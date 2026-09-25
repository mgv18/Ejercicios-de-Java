import java.util.Scanner;

public class tallercito2 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double angulo1, angulo2, angulo3, suma;
            System.out.println("Ingrese el valor de la angulo: ");
            angulo1 = sc.nextDouble();
            System.out.println("Ingrese el valor de la angulo: ");
            angulo2 = sc.nextDouble();
            System.out.println("Ingrese el valor de la angulo: ");
            angulo3 = sc.nextDouble();
            suma = angulo1 + angulo2 + angulo3;
            if (angulo1 > 0 && angulo2 > 0 && angulo3 > 0 && suma == 180) {
                System.out.println("Los angulos corresponden a un triangulo");
            } else {
                System.out.println("Los angulos corresponden a un triangulo");
            }
        }
    }

