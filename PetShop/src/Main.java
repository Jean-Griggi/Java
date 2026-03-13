import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        ArrayList<pet> listaDePets = new ArrayList<>();

        int escolhaPrincipal;
        int servico;
        double precoBase;
        double precoFinal;

        do {
            System.out.println("       |\\__/,|   (`\\");
            System.out.println("     _.|o o  |_   ) )");
            System.out.println("---(((---(((-----------------");
            System.out.println("   PETSHOP HOTDOG & (HOT CAT'S)");
            System.out.println("-----------------------------");
            System.out.println("1- Adicionar um PET");
            System.out.println("2- Serviços e preços");
            System.out.println("3- Lista de Pet's cadastrados");
            System.out.println("4- Sair");
            System.out.print("Escolha uma opção: ");

            escolhaPrincipal = leia.nextInt();
            leia.nextLine();

            switch (escolhaPrincipal) {
                case 1 -> {
                    System.out.print("Qual o vulgo: ");
                    String nome = leia.nextLine();

                    System.out.print("Informe a raça do desgraçado: ");
                    String raca = leia.nextLine();

                    System.out.print("o quão gordo ele é: ");
                    double peso = leia.nextDouble();

                    System.out.print("passou de 30 anos faz eutanasia: ");
                    int idade = leia.nextInt();

                    pet NovoPet = new pet(nome, peso, idade, raca);
                    listaDePets.add(NovoPet);

                    System.out.println("\n Pet " + nome + "Mais um para o cativeiro");
                }

                case 2 -> {

                    if (listaDePets.isEmpty()) {
                        System.out.println("\nBota a porra de um bicho primeiro animal! (vc n serve como animal)");
                    }
                    else {
                        System.out.println("\n=== MENU DE SERVIÇOS ===");
                        System.out.println("1 - Banho (30 Reais)");
                        System.out.println("2 - Tosa (40 Reais)");
                        System.out.print("Escolha o serviço: ");
                        servico = leia.nextInt();

                         precoBase = (servico == 1) ? 30.0 : 40.0;
                         precoFinal = precoBase;

                        pet PetAtual = listaDePets.get(0);

                        if (PetAtual.peso > 20.0) {
                            precoFinal += 20.0;
                            System.out.println("Obesos pagam mais 20 conto (se tá achando ruim bota a bola pra rolar)");
                        }

                        System.out.println("você me deve " + precoFinal);
                    }
                }

                case 3 -> {
                    if (listaDePets.isEmpty()) {
                        System.out.println("AQ TEU ANIMAL AQ HÓ KKKKKKKKKKKKKKKKKKKK\n" +
                                "                                   \"................. .. ... /´ /)\\n\" +\n" +
                                "                                \".................... ..,../¯ ..//\\n\" +\n" +
                                "                                \".................... ..../... ./ /\\n\" +\n" +
                                "                                \".................... ..,/¯ ..//\\n\" +\n" +
                                "                                \".................... ./... ./ /\\n\" +\n" +
                                "                                \"............./´¯/' ...'/´¯`.¸\\n\" +\n" +
                                "                                \"........../'/.../... ./... ..../¨¯\\\\\\n\" +\n" +
                                "                                \"........('(...´(... ....... ,~/'...')\\n\" +\n" +
                                "                                \".........\\\\.......... ..... ..\\\\/..../\\n\" +\n" +
                                "                                \"..........''...\\\\.... ..... . _...´\\n\" +\n" +
                                "                                \"............\\\\....... ..... ..(\\n\" +\n" +
                                "                                \"..............\\\\..... ..... ...\\\\\");");
                    }
                    else {
                        System.out.println("Lista de PETS\n" +
                                "　 　　 　 ／＞　 フ\n" +
                                "　　　　　| 　_　 _|\n" +
                                "　 　　　／`ミ _x 彡\n" +
                                "　　 　 /　　　 |\n" +
                                "　　　 /　 ヽ　　 ﾉ\n" +
                                "　／￣|　　 |　|　|\n" +
                                "　| (￣ヽ＿_ヽ_)_)\n" +
                                "　＼二つ");
                        for (int i = 0; i < listaDePets.size(); i++){
                            pet p = listaDePets.get(i);
                            System.out.println("Pet #" + (i+1));
                            System.out.println("Nome: " + p.nome);
                            System.out.println("Raça: " + p.raca);
                            System.out.println("Peso: " + p.peso);
                            System.out.println("Idade: " + p.idade);
                            System.out.println("----------");
                        }

                    }
                }

                case 4 -> System.out.println("Nossa empresa não fecha com duro e toma esse gato pika ai \n " +
                        "______________a__________a\n" +
                        "_____________aaa________aaa\n" +
                        "____________aaaaaaaaaaaaaaaa\n" +
                        "___________aaaaaaaaaaaaaaaaaa\n" +
                        "__________aaaaa_aaaaaaa_aaaaaa\n" +
                        "__________aaaaaaaaaaaaaaaaaaaa\n" +
                        "___________aaaaaaaaaaaaaaaaaa\n" +
                        "____________aaaaaaa__aaaaaaa\n" +
                        "_____________*.*.*.*.*.*.*.*.*.\n" +
                        "__a_________aaaaaaaaaaaaaaaa\n" +
                        "_aaa_______aaaaaaaaaaaaaaaaaa\n" +
                        "_aaa______aaaaaaaaaaaaaaaaaaaa\n" +
                        "_aaa_____aaaaaaaaaaaaaaaaaaaaaa\n" +
                        "_aaa____aaaaaaaaaaaaaaaaaaaaaaaa\n" +
                        "__aaa___aaaaaaaaaaaaaaaaaaaaaaaa\n" +
                        "__aaa___aaaaaaaaaaaaaaaaaaaaaaaa\n" +
                        "__aaa____aaaaaaaaaaaaaaaaaaaaaa\n" +
                        "___aaa____aaaaaaaaaaaaaaaaaaaa\n" +
                        "____aaaaaaaaaaaaaaaaaaaaaaaaaa\n" +
                        "_____aaaaaaaaaaaaaaaaaaaaaaaaa\n" +
                        "\n" +
                        ".•*´¨`*•.¸♥¸.•*´¨`*•.¸NOIS É MIDIA FDP!.•*´¨`*•.¸♥¸.•*´¨`*•.¸");

                default -> System.out.println("Animais não podem fazer cadastro de si próprio (Seu burro, caso não tenha entendido, te chamei de burro seu otário)");
            }

        } while (escolhaPrincipal != 4);

        leia.close();
    }
}