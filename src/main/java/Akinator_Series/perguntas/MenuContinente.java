/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Akinator_Series.perguntas;


import java.util.Scanner;

/**
 * @author Dieuphenson
 */
public class MenuContinente {

    private int opcao = 0;

    public void executar() {
        Scanner scanner = new Scanner(System.in);

        while (opcao != 3) {
            System.out.println("De qual continente é a série ?");
            System.out.println("1. Americano.");
            System.out.println("2. Europeu.");
            System.out.println("3. Sair.");
            System.out.print("Digite sua opção: ");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                MenuTipoSerie menuTipoSerie = new MenuTipoSerie();
                menuTipoSerie.executar();
                return;
            } else if (opcao == 2) {
                System.out.println("Você escolheu 'Lupin'.");
                return;
            } else if (opcao == 3) {
                System.out.println("Você saiu do quiz de séries.");
                return;
            } else {
                System.out.println("Opção inválida. Escolha novamente.");
            }
        }
    }
}
