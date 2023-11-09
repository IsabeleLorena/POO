/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Akinator_Series.perguntas;


import java.util.Scanner;

/**
 *
 * @author Dieuphenson
 */
public class MenuTipoSerie {
    private int opcao = 0;

    public void executar() {
        Scanner scanner = new Scanner(System.in);

        while (opcao != 6) {
            System.out.println("Qual tipo de Série ?");
            System.out.println("1. Policial/Investigação.");
            System.out.println("2. Ação.");
            System.out.println("3. Comédia.");
            System.out.println("4. Romance.");
            System.out.println("5. Terror.");
            System.out.println("6. Sair.");
            System.out.print("Digite sua opção: ");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                MenuGenero menuGenero = new MenuGenero();
                menuGenero.executarPolicialInvestigacao();
                return;
            } else if (opcao == 2) {
                MenuGenero menuGenero = new MenuGenero();
                menuGenero.executarAcao();
                return;
            } else if (opcao == 3) {
                MenuGenero menuGenero = new MenuGenero();
                menuGenero.executarComedia();
                return;
            } else if (opcao == 4) {
                MenuGenero menuGenero = new MenuGenero();
                menuGenero.executarRomance();
                return;
            } else if (opcao == 5) {
                MenuGenero menuGenero = new MenuGenero();
                menuGenero.executarTerror();
                return;
            }
        }
    }
}
