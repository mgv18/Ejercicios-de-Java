public class quinto {
    public static void main(String[] args) {

        String serial = "L8";

        char digitoChar = serial.charAt(1);

        int digitoEntero = Character.getNumericValue(digitoChar);

        System.out.println("Carácter: " + digitoChar);
        System.out.println("Valor entero: " + digitoEntero);
    }
}
