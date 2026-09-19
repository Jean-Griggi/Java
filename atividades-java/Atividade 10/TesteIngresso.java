public class TesteIngresso {
    public static void main(String[] args) {

        Ingresso i1 = new Ingresso("Inteira", 100.00);

        i1.aplicarDesconto(10);

        System.out.println(
                "Valor com desconto simples: " + i1.getValor()
        );

        Ingresso i2 = new Ingresso("Inteira", 100.00);

        i2.aplicarDesconto(50, 20);

        System.out.println(
                "Valor com desconto limitado: " + i2.getValor()
        );
    }
}
