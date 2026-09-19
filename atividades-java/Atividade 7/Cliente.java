public class Cliente {
    private String nome;
    private String email;
    private String telefone;

    public Cliente() {
        this("");
    }

    public Cliente(String nome) {
        this(nome, "", "");
    }

    public Cliente(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public String resumo() {
        return "Nome: " + nome + " | Email: " + email
                + " | Telefone: " + telefone;
    }
}
