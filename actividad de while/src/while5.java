import java.util.Scanner;

public class while5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String respuesta = "";

        //equalsIgnoreCase: permite escribir en mayuscula o minuscula.

        while (!respuesta.equalsIgnoreCase("S")) {

            System.out.print("¿Desea salir? (S/N): ");
            respuesta = sc.nextLine();

        }

        System.out.println("Programa finalizado.");
    }
}
