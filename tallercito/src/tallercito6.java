import java.util.Scanner;

public class tallercito6 {
    public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            System.out.print("Ingrese el nombre del producto (lentejas, crema, arroz, vino): ");
            String producto = entrada.nextLine().trim().toLowerCase();
            switch (producto) {
                case "lentejas":
                case "arroz":
                    System.out.println("El producto '" + producto + "' NO paga IVA.");
                    break;
                case "crema":
                case "vino":
                    System.out.println("El producto '" + producto + "' SÍ paga IVA.");
                    break;
                default:
                    System.out.println("Producto no reconocido. Asegúrese de escribir: lentejas, crema, arroz o vino.");
            }
    }
}
