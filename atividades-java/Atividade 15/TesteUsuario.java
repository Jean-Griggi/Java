public class TesteUsuario {
    public static void main(String[] args) {

        Usuario u = new Usuario("admin", "1234");

        u.autenticar("1234");
    }
}
