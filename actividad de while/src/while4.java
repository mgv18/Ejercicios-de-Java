import java.util.Scanner;

public class while4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int i = 1;
        System.out.print("Ingrese el valor de n: ");
        n = sc.nextInt();
        while (i <= n) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}

