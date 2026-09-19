public class TesteVeiculo {

    public static void alterarPlaca(Veiculo v) {
        v.setPlaca("AAA0A11");
    }

    public static void trocarObjeto(Veiculo v) {
        v = new Veiculo();
        v.setPlaca("BBB0B22");
    }

    public static void main(String[] args) {

        Veiculo v = new Veiculo();

        v.setPlaca("XYZ1234");

        System.out.println(
                "Placa inicial: " + v.getPlaca()
        );

        alterarPlaca(v);

        System.out.println(
                "Apos alterarPlaca: " + v.getPlaca()
        );

        trocarObjeto(v);

        System.out.println(
                "Apos trocarObjeto: " + v.getPlaca()
        );
    }
}
