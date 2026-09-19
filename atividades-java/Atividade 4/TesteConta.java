public class TesteConta {
    public static void main(String[] args) {

        ContaBancaria c = new ContaBancaria();

        c.setNumero(123);
        c.setTitular("Carlos");

        c.depositar(1000);
        System.out.println("Saldo apos deposito: R$ " + c.getSaldo());

        c.sacar(300);
        System.out.println("Saldo apos saque valido: R$ " + c.getSaldo());

        c.sacar(5000);
        System.out.println("Saldo apos tentativa de saque maior: R$ " + c.getSaldo());
    }
}
