public class ejercicio12 {
    public static void main(String[] args) {

        String saldoTexto = "$1,250.75";

        String textoLimpio = saldoTexto.replace("$", "").replace(",", "");

        double saldoNumerico = Double.parseDouble(textoLimpio);

        System.out.println("Saldo original: " + saldoTexto);
        System.out.println("Texto limpio: " + textoLimpio);
        System.out.println("Saldo numérico: " + saldoNumerico);
    }

}
