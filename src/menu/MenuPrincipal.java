package menu;

import java.util.Scanner;

/**
 * Menu principal do sistema.
 */
public class MenuPrincipal {

    public void exibirMenu() {

        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {

            System.out.println("
===== SISTEMA ACADEMIA =====");
            System.out.println("1 - Gerenciar alunos");
            System.out.println("2 - Gerenciar planos");
            System.out.println("3 - Gerenciar aulas");
            System.out.println("0 - Sair");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Menu alunos");
                    break;

                case 2:
                    System.out.println("Menu planos");
                    break;

                case 3:
                    System.out.println("Menu aulas");
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida");
            }

        } while (opcao != 0);
    }
}