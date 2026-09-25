public class septimo {
    public static void main(String[] args) {

        long entradaGrande = 2147483648L;

        boolean esValidoParaInt =
                entradaGrande <= Integer.MAX_VALUE &&
                        entradaGrande >= Integer.MIN_VALUE;

        System.out.println("¿Es válido para int?: " + esValidoParaInt);
    }
    }

