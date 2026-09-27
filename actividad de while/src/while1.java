import java.util.Scanner;
public class while1 {
 public static void main() {
     Scanner sc = new Scanner(System.in);
     int n;
     int i = 1;
     System.out.print("Ingrese el valor de n: ");
     n = sc.nextInt();
     while (i <= n) {
         System.out.println(i);
         i++;
     }

    }
}
