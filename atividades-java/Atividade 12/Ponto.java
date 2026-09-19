public class Ponto {
    private int x;
    private int y;

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean saoIguais(Ponto outro) {
        return this.x == outro.x && this.y == outro.y;
    }
}
