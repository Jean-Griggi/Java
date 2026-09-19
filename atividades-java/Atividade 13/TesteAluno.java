import java.util.ArrayList;

public class TesteAluno {
    public static void main(String[] args) {

        ArrayList<Aluno> lista = new ArrayList<>();

        Aluno a1 = new Aluno(1, "Ana");
        Aluno a2 = new Aluno(1, "Beatriz");

        lista.add(a1);
        lista.add(a2);

        int distintos = 0;

        for (int i = 0; i < lista.size(); i++) {

            boolean jaExiste = false;

            for (int j = 0; j < i; j++) {

                if (lista.get(i).saoIguais(lista.get(j))) {
                    jaExiste = true;
                }
            }

            if (!jaExiste) {
                distintos++;
            }
        }

        System.out.println(
                "Quantidade considerando saoIguais: " + distintos
        );

        System.out.println(
                "Quantidade total sem comparacao: " + lista.size()
        );
    }
}
