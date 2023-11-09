
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

        System.out.println("Escolha uma das series listadas");
        System.out.println("- CRIMINAL MINDS");
        System.out.println("- ORANGE IS THE NEW BLACK");
        System.out.println("- OUTLANDER");
        System.out.println("- GILMORE GIRLS");
        System.out.println("- O MENTALISTA");
        System.out.println("- THE BIG BANG THEORY");
        System.out.println("- LUPIN");
        System.out.println("- GAME OF THRONES");
        System.out.println("- EU,A PATROA E AS CRIANÇAS");
        System.out.println("- HANMIBAL");
        System.out.println("- THE HAUNTING OF HILL HOUSE");

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
