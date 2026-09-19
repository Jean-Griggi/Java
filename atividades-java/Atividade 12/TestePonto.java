public class TestePonto {
    public static void main(String[] args) {

        Ponto p1 = new Ponto(2, 3);
        Ponto p2 = new Ponto(2, 3);
        Ponto p3 = p1;

        System.out.println(
                "p1 e p2 mesma referencia: " + (p1 == p2)
        );

        System.out.println(
                "p1 e p2 mesmo conteudo: " + p1.saoIguais(p2)
        );

        System.out.println(
                "p1 e p3 mesma referencia: " + (p1 == p3)
        );

        System.out.println(
                "p1 e p3 mesmo conteudo: " + p1.saoIguais(p3)
        );
    }
}
