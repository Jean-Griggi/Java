public class TesteFuncionario {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario();
        f1.setNome("Ana");
        f1.setSalarioBase(2500.00);
        f1.setBonus(500.00);

        Funcionario f2 = new Funcionario();
        f2.setNome("Bruno");
        f2.setSalarioBase(4000.00);
        f2.setBonus(800.00);

        System.out.println("Salario total de " + f1.getNome()
                + ": R$ " + f1.getSalarioTotal());

        System.out.println("Salario total de " + f2.getNome()
                + ": R$ " + f2.getSalarioTotal());
    }
}
