import java.util.Scanner;

public class tallerfor8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double nota1, nota2, nota3, promedio;
        System.out.print("Ingrese la cantidad de estudiantes: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {

            System.out.println("\nEstudiante " + i);

            System.out.print("Ingrese la nota 1: ");
            nota1 = sc.nextDouble();

            System.out.print("Ingrese la nota 2: ");
            nota2 = sc.nextDouble();

            System.out.print("Ingrese la nota 3: ");
            nota3 = sc.nextDouble();

            promedio = (nota1 + nota2 + nota3) / 3;

            System.out.println("El promedio del estudiante " + i + " es: " + promedio);
        }
    }
}
