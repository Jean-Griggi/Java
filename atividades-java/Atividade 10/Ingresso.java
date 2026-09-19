public class Ingresso {
    private String tipo;
    private double valor;

    public Ingresso(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public void aplicarDesconto(double percentual) {
        valor = valor - (valor * percentual / 100);
    }

    public void aplicarDesconto(double percentual, double maximo) {
        double desconto = valor * percentual / 100;

        if (desconto > maximo) {
            desconto = maximo;
        }

        valor = valor - desconto;
    }

    public double getValor() {
        return valor;
    }
}
