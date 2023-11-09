
package Akinator_Series.perguntas;

import java.util.Scanner;

/**
 *
 * @author Dieuphenson
 */
public class MenuPrincipal {
    private int opcao = 0;

    public void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("**** FILMES E PERSONAGENS DE CINEMA ******");
            System.out.println("Escolha um idioma:");
            System.out.println("1. Inglês.");
            System.out.println("2. Francês.");
            System.out.println("3. Sair.");
            System.out.print("Digite sua opção: ");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                MenuContinente menuContinente = new MenuContinente();
                menuContinente.executar();
            } else if (opcao == 2) {
                MenuContinente menuContinente = new MenuContinente();
                menuContinente.executar();
            } else if (opcao == 3) {
                System.out.println("Você saiu do programa.");
            } else {
                System.out.println("Opção inválida. Escolha novamente.");
            }
    }
}
