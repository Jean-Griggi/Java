public class monitortrintaeduaspolegadasdojean {
    private String modelo;
    private Sisteminhadahora sistema;

    public monitortrintaeduaspolegadasdojean(String modelo, Sisteminhadahora sistema) {
        this.modelo = modelo;
        this.sistema = sistema;
    }

    public void procurarAtualizacao(servidornuvezinha nuvem) {
        System.out.println("\n[Monitor " + modelo + "] clk, tem atualização? ");
        System.out.println("Versão do bglh: " + sistema.getVersao() + " | cheio de problema sapoha " + sistema.isTemproblema());

        String versaoNova = nuvem.checarSeTemUpdate(sistema.getVersao());

        if (versaoNova != null) {
            System.out.println("olha a nova versão ai kk" + versaoNova + "! ele tá sendo baixada dessa parada aqui hó: " + nuvem.getLink());

            sistema.atualizar(versaoNova);

            System.out.println("pode dale pae, tá atualizado " + sistema.getVersao() + ". Resolvi o problema, sou pika " + !sistema.isTemproblema());
        } else {
            System.out.println("infelizmente tá tudo certo nesse bglh ฅ^•ﻌ•^ฅ ");
        }
    }
}