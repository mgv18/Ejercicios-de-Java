public class ejercicio15 {
    public static void main(String[] args) {

        int idUsuario = 1045;
        boolean activo = true;

        String idTexto = String.valueOf(idUsuario);

        String registroCompleto =
                "ID: " + idTexto + " | Activo: " + String.valueOf(activo);

        System.out.println(registroCompleto);
    }

}
