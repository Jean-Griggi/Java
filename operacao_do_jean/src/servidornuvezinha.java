public class servidornuvezinha {
    private String realorfake;
    private String link;

    public servidornuvezinha(String realorfake, String link) {
        this.realorfake = realorfake;
        this.link = link;
    }

    public String checarSeTemUpdate(String versaoAtual) {
        if (!versaoAtual.equals(realorfake)) {
            return realorfake;
        }
        return null;
    }

    public String getLink() {
        return link;
    }
}