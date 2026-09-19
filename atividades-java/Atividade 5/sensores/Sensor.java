package sensores;

public class Sensor {
    private double leituraBruta;

    public double lerValor() {
        calibrar();
        return leituraBruta;
    }

    private void calibrar() {
        leituraBruta = leituraBruta * 1.1;
    }

    public void setLeituraBruta(double valor) {
        this.leituraBruta = valor;
    }
}
