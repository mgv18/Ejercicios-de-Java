public class octavo {
    public static void main(String[] args) {

        int numeroBase = 255;

        String enHexa = Integer.toHexString(numeroBase);
        String enBinario = Integer.toBinaryString(numeroBase);

        System.out.println("Número decimal: " + numeroBase);
        System.out.println("Hexadecimal: " + enHexa);
        System.out.println("Binario: " + enBinario);
    }
    }


