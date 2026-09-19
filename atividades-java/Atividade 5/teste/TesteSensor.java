package teste;

import sensores.Sensor;

public class TesteSensor {
    public static void main(String[] args) {

        Sensor s = new Sensor();

        s.setLeituraBruta(100);

        System.out.println("Leitura calibrada: " + s.lerValor());
    }
}
