public class TesteCliente {
    public static void main(String[] args) {

        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente("Maria");
        Cliente c3 = new Cliente(
                "Joao",
                "joao@email.com",
                "99999-1111"
        );

        System.out.println(c1.resumo());
        System.out.println(c2.resumo());
        System.out.println(c3.resumo());
    }
}
