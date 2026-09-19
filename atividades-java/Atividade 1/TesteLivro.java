public class TesteLivro {
    public static void main(String[] args) {

        Livro l1 = new Livro();
        l1.setTitulo("Dom Casmurro");
        l1.setAutor("Machado de Assis");
        l1.setAnoPublicacao(1899);
        l1.setPreco(39.90);

        Livro l2 = new Livro();
        l2.setTitulo("O Cortico");
        l2.setAutor("Aluisio Azevedo");
        l2.setAnoPublicacao(1890);
        l2.setPreco(29.50);

        Livro l3 = new Livro();
        l3.setTitulo("Grande Sertao Veredas");
        l3.setAutor("Guimaraes Rosa");
        l3.setAnoPublicacao(1956);
        l3.setPreco(59.90);

        System.out.println(l1.getTitulo() + " - " + l1.getAutor() + " - "
                + l1.getAnoPublicacao() + " - R$ " + l1.getPreco());

        System.out.println(l2.getTitulo() + " - " + l2.getAutor() + " - "
                + l2.getAnoPublicacao() + " - R$ " + l2.getPreco());

        System.out.println(l3.getTitulo() + " - " + l3.getAutor() + " - "
                + l3.getAnoPublicacao() + " - R$ " + l3.getPreco());
    }
}
