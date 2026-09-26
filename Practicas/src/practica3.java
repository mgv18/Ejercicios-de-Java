import java.util.Scanner;

public class practica3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el precio base del electrodoméstico: ");
        double precioBase = entrada.nextDouble();
        System.out.print("Ingrese el plazo en meses para pagarlo a crédito: ");
        int meses = entrada.nextInt();
            double valorGlobalCredito = precioBase * 1.25;
            double cuotaMensual = valorGlobalCredito / meses;
            System.out.println("Resumen de la Compra a Crédito ");
            System.out.println("Precio base: $" + precioBase);
            System.out.println("Valor total a crédito (con 25% de incremento): $" + valorGlobalCredito);
            System.out.println("Plazo seleccionado: " + meses + " meses");
            System.out.println("Valor fijo de la cuota mensual: $" + cuotaMensual);
        }
    }

