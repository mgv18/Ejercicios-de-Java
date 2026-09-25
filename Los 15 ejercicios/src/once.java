public class once {
    public static void main(String[] args) {

        double resultadoDivision = 5.0 / 0.0;

        boolean esInfinito = Double.isInfinite(resultadoDivision);

        System.out.println("Resultado de la división: " + resultadoDivision);
        System.out.println("¿Es infinito?: " + esInfinito);
    }
}
