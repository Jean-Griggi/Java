public class Sisteminhadahora {
    private String versao;
    private boolean temproblema;

    public Sisteminhadahora(String versao, boolean temproblema) {
        this.versao = versao;
        this.temproblema = temproblema;
    }

    public String getVersao() {
        return versao;
    }

    public boolean isTemproblema() {
        return temproblema;
    }

    public void atualizar(String novaVersao) {
        this.versao = novaVersao;
        this.temproblema = false;
    }
}