import dao.UsuarioDAO;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Adicionar Usuário");
            System.out.println("2. Listar Usuários");
            System.out.println("3. Atualizar Usuário");
            System.out.println("4. Deletar Usuário");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    System.out.print("Digite o nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o email: ");
                    String email = scanner.nextLine();
                    UsuarioDAO.inserirUsuario(nome, email);
                    break;

                case 2:
                    UsuarioDAO.listarUsuarios();
                    break;

                case 3:
                    System.out.print("Digite o ID do usuário a atualizar: ");
                    int idAtualizar = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Digite o novo nome: ");
                    String novoNome = scanner.nextLine();
                    System.out.print("Digite o novo email: ");
                    String novoEmail = scanner.nextLine();
                    UsuarioDAO.atualizarUsuario(idAtualizar, novoNome, novoEmail);
                    break;

                case 4:
                    System.out.print("Digite o ID do usuário a deletar: ");
                    int idDeletar = scanner.nextInt();
                    UsuarioDAO.deletarUsuario(idDeletar);
                    break;

                case 5:
                    System.out.println("Saindo do programa...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
