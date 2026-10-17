import java.util.Random; // Importa a ferramenta de números aleatórios do Java

public class Main {
    public static void main(String[] args) {

        Random sorteador = new Random();

        System.out.println("atualizando (´-_-`) ");

        boolean comecaAtualizado = sorteador.nextBoolean();

        String versaoInicial;
        boolean temProblemaInicial;

        if (comecaAtualizado) {
            versaoInicial = "v2";
            temProblemaInicial = false;
        } else {
            versaoInicial = "v1";
            temProblemaInicial = true;
        }

        servidornuvezinha nuvem = new servidornuvezinha("v2", "brasino.com.br");
        Sisteminhadahora meuSistema = new Sisteminhadahora(versaoInicial, temProblemaInicial);

        monitortrintaeduaspolegadasdojean meuMonitor = new monitortrintaeduaspolegadasdojean("32 POLEGADAS INSANA IRMÃO, CURVADO OLED, 57 CORES", meuSistema);

        meuMonitor.procurarAtualizacao(nuvem);

        System.out.println("\n Finalmente acabou sapoha ( ͡ಥ ͜ʖ ͡ಥ)");
    }
}