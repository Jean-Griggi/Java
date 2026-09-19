public class TesteProduto {
    public static void main(String[] args) {

        Produto p = new Produto();

        p.setNome("Teclado");
        p.setPreco(150.00);
        p.setQuantidade(10);

        p.setPreco(-50);
        p.setQuantidade(-3);

        System.out.println("Nome: " + p.getNome());
        System.out.println("Preco: " + p.getPreco());
        System.out.println("Quantidade: " + p.getQuantidade());
    }
}
