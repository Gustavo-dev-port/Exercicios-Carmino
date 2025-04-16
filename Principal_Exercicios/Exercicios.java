import java.util.Scanner;

public class Exercicios {

    public void verificarAnoBissexto() {
        Scanner datScanner = new Scanner(System.in);
        System.out.println("Digite o ano que deseja verificar se é bissexto: ");
        int ano = datScanner.nextInt();

        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            System.out.println("O ano " + ano + " é bissexto.");
        } else {
            System.out.println("O ano " + ano + " não é bissexto.");
        }
    }

    public void aprovacaoAluno() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a nota da A1: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a nota da A2: ");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite a nota da A3: ");
        double nota3 = scanner.nextDouble();
        double media = (nota1 + nota2 + nota3) / 3;
        if (media >= 6) {
            System.out.println("Aprovado com média: " + media);
        } else if (media >= 5) {
            System.out.println("Recuperação com média: " + media);
        } else {
            System.out.println("Reprovado com média: " + media);
        }

    }

    public void casoSwitch() {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        System.out
                .println(
                        "MENU DE OPÇÕES: \n1 - Suporte Tecnico\n2 - Financeiro\n3 - Falar com Atendente 3\n4 - Cancelar Serviço\n5 - Encerrar Atendimento");
        System.out.println("Escolha uma opção: ");
        opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                System.out.println(
                        "SUPORTE TECNICO: \n1 - Internet Fixa \n2 - Celular \n3 - Telefone Fixo \n4 - Voltar ao Menu Principal");
                System.out.println("Escolha uma opção: ");
                int opcaoSuporte = scanner.nextInt();
                switch (opcaoSuporte) {
                    case 1:
                        System.out.println("Você escolheu Internet Fixa.");
                        break;
                    case 2:
                        System.out.println("Você escolheu Celular.");
                        break;
                    case 3:
                        System.out.println("Você escolheu Telefone Fixo.");
                        break;
                    case 4:
                        System.out.println("Voltando ao menu principal...");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente Novamente");

                }
                break;
            case 2:
                System.out.println(
                        "FINANCEIRO: \n1 - Conta a Pagar \n2 - Conta a Receber \n3 - Extrato \n4 - Voltar ao Menu Principal");
                System.out.println("Escolha uma opção: ");
                int opcaoFinanceiro = scanner.nextInt();
                switch (opcaoFinanceiro) {
                    case 1:
                        System.out.println("Você escolheu Conta a Pagar.");
                        break;
                    case 2:
                        System.out.println("Você escolheu Conta a Receber.");
                        break;
                    case 3:
                        System.out.println("Você escolheu Extrato.");
                        break;
                    case 4:
                        System.out.println("Voltando ao menu principal...");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente Novamente");
                }
                break;
            case 3:
                System.out.println("Todos os Atendentes estão ocupados agora, a taxa de espera é de 10minutos.");
                break;
            case 4:
                System.out.println("Cancelando serviço...");
                System.out.println("Serviço cancelado com sucesso.");
                break;
            case 5:
                System.out.println("Encerrando atendimento...");
                System.out.println("Atendimento encerrado com sucesso.");
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
}
