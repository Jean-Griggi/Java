public class Main {
    public static void main(String[] args) {

        System.out.println("atualizando (´-_-`) ");

        servidornuvezinha nuvem = new servidornuvezinha("v2", "brasino.com.br");
        Sisteminhadahora meuSistema = new Sisteminhadahora("v1", true);
        monitortrintaeduaspolegadasdojean meuMonitor = new monitortrintaeduaspolegadasdojean("32 POLEGADAS INSANA IRMÃO, CURVADO OLED, 57 CORES", meuSistema);

        meuMonitor.procurarAtualizacao(nuvem);

        System.out.println("\n Finalmente acabou sapoha ( ͡ಥ ͜ʖ ͡ಥ)");
    }
}