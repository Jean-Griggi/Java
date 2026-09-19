public class Aluno {
    private int ra;
    private String nome;

    public Aluno(int ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }

    public boolean saoIguais(Aluno outro) {
        return this.ra == outro.ra;
    }

    public int getRa() {
        return ra;
    }
}
