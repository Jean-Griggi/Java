public class TesteCalculadora {
    public static void main(String[] args) {

        Calculadora c = new Calculadora();

        int[] v = {1, 2, 3, 4, 5};

        System.out.println("Soma 2 ints: " + c.somar(2, 3));
        System.out.println("Soma 3 ints: " + c.somar(2, 3, 4));
        System.out.println("Soma 2 doubles: " + c.somar(2.5, 3.5));
        System.out.println("Soma vetor: " + c.somar(v));
    }
}
