import java.util.ArrayList;

public class TesteMusica {
    public static void main(String[] args) {

        Musica m1 = new Musica(
                "Evidencias",
                "Chitaozinho e Xororo",
                4.5
        );

        Musica m2 = new Musica(
                "Anunciacao",
                "Alceu Valenca",
                3.8
        );

        System.out.println(m1.resumo());
        System.out.println("Musica: " + m1.resumo());

        ArrayList<Musica> lista = new ArrayList<>();

        lista.add(m1);
        lista.add(m2);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).resumo());
        }
    }
}
