public class Usuario {
    private String login;
    private String senha;

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public void autenticar(String senhaDigitada) {

        boolean mesmaReferencia = (this.senha == senhaDigitada);

        boolean mesmoConteudo = this.senha.equals(senhaDigitada);

        System.out.println(
                "Mesma referencia: " + mesmaReferencia
        );

        System.out.println(
                "Mesmo conteudo: " + mesmoConteudo
        );
    }
}
