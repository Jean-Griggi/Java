public class TesteRetangulo {
    public static void main(String[] args) {

        Retangulo r1 = new Retangulo(5, 3);
        Retangulo r2 = new Retangulo(10, 4);
        Retangulo r3 = new Retangulo(7, 7);

        System.out.println("Retangulo 1 - Area: " + r1.calcularArea()
                + " Perimetro: " + r1.calcularPerimetro());

        System.out.println("Retangulo 2 - Area: " + r2.calcularArea()
                + " Perimetro: " + r2.calcularPerimetro());

        System.out.println("Retangulo 3 - Area: " + r3.calcularArea()
                + " Perimetro: " + r3.calcularPerimetro());
    }
}
