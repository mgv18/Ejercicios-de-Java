public class decimo {
    public static void main(String[] args) {

        Integer[] notas = {90, 85, 88};

        int sumaNotas = notas[0] + notas[1] + notas[2];

        double promedioFinal = (double) sumaNotas / notas.length;

        System.out.println("Suma de notas: " + sumaNotas);
        System.out.println("Promedio final: " + promedioFinal);
    }
}
