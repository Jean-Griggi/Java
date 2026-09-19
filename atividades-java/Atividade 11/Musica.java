public class Musica {
    private String titulo;
    private String artista;
    private double duracao;

    public Musica(String titulo, String artista, double duracao) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracao = duracao;
    }

    public String resumo() {
        return titulo + " - " + artista + " (" + duracao + " min)";
    }
}
