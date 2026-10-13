import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {
    private static final List<Solicitacao> solicitacoes = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("\n=== Sistema de Gerenciamento de Solicitações ===");
            System.out.println("1. Criar nova solicitação");
            System.out.println("2. Listar solicitações");
            System.out.println("3. Atualizar solicitação");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1 -> criarSolicitacao();
                case 2 -> listarSolicitacoes();
                case 3 -> atualizarSolicitacao();
                case 4 -> System.out.println("Encerrando o sistema. Até logo!");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);
    }

    private static void criarSolicitacao() {
        System.out.print("Digite a descrição da solicitação: ");
        String descricao = scanner.nextLine();
        Solicitacao novaSolicitacao = new Solicitacao(descricao);
        solicitacoes.add(novaSolicitacao);
        System.out.println("Solicitação criada com sucesso! ID: " + novaSolicitacao.getId());
    }

    private static void listarSolicitacoes() {
        if (solicitacoes.isEmpty()) {
            System.out.println("Nenhuma solicitação encontrada.");
        } else {
            System.out.println("\n=== Lista de Solicitações ===");
            for (Solicitacao solicitacao : solicitacoes) {
                System.out.println(solicitacao);
            }
        }
    }

    private static void atualizarSolicitacao() {
        System.out.print("Digite o ID da solicitação que deseja atualizar: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        Solicitacao solicitacao = buscarSolicitacaoPorId(id);
        if (solicitacao != null) {
            System.out.println("Solicitação encontrada: " + solicitacao);
            System.out.println("1. Alterar descrição");
            System.out.println("2. Alterar status");
            System.out.println("3. Atribuir responsável");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite a nova descrição: ");
                    String novaDescricao = scanner.nextLine();
                    solicitacao.setDescricao(novaDescricao);
                    System.out.println("Descrição atualizada com sucesso!");
                }
                case 2 -> {
                    System.out.print("Digite o novo status (Pendente/Em andamento/Concluído): ");
                    String novoStatus = scanner.nextLine();
                    solicitacao.setStatus(novoStatus);
                    System.out.println("Status atualizado com sucesso!");
                }
                case 3 -> {
                    System.out.print("Digite o nome do responsável: ");
                    String responsavel = scanner.nextLine();
                    solicitacao.setResponsavel(responsavel);
                    System.out.println("Responsável atribuído com sucesso!");
                }
                default -> System.out.println("Opção inválida.");
            }
        } else {
            System.out.println("Solicitação com ID " + id + " não encontrada.");
        }
    }

    private static Solicitacao buscarSolicitacaoPorId(int id) {
        for (Solicitacao solicitacao : solicitacoes) {
            if (solicitacao.getId() == id) {
                return solicitacao;
            }
        }
        return null;
    }
}

