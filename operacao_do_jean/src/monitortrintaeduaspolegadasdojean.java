public class monitortrintaeduaspolegadasdojean {
    private String modelo;
    private Sisteminhadahora sistema;

    public monitortrintaeduaspolegadasdojean(String modelo, Sisteminhadahora sistema) {
        this.modelo = modelo;
        this.sistema = sistema;
    }

    public void procurarAtualizacao(servidornuvezinha nuvem) {
        System.out.println("\n[Monitor " + modelo + "] clk, tem atualização? ");

        String statusProblema;
        if (sistema.isTemproblema()) {
            statusProblema = "Bagulho tá uma merda, tá pior que o flávio tentando se eleger";
        } else {
            statusProblema = "LISO LISO LISO PAI, FAZ O LLLLLLLLLL";
        }

        System.out.println("Versão do bglh: " + sistema.getVersao() + " | Status: " + statusProblema);

        String versaoNova = nuvem.checarSeTemUpdate(sistema.getVersao());

        if (versaoNova != null) {
            System.out.println("olha a nova versão ai kkv2! ele tá sendo baixada dessa parada aqui hó: " + nuvem.getLink());

            sistema.atualizar(versaoNova);

            System.out.println("pode dale pae, tá atualizado " + sistema.getVersao() + ". Resolvi o problema, sou pika!");
        } else {
            System.out.println("infelizmente tá tudo certo nesse bglh ฅ^•ﻌ•^ฅ ");
        }
    }
}