public class TesteData {
    public static void main(String[] args) {

        Data d1 = new Data(15, 6, 2024);
        Data d2 = new Data(2025);

        System.out.println(d1.resumo());
        System.out.println(d2.resumo());
    }
}
