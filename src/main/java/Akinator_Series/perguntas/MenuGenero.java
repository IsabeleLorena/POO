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
public class MenuGenero {

    public void executarRomance() {
        System.out.println("1.Uma série romântica sobre um casal improvável.");
        System.out.println("2.Uma série de romance que se passa em uma pequena cidade.");
        System.out.println("3. Sair.");
        System.out.print("Digite sua opção:");
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            System.out.println("Você escolheu 'Outlander'.");
        } else if (opcao == 2) {
            System.out.println("Você escolheu 'Gilmore Girls'.");
        } else if (opcao == 3) {
            System.out.println("Você saiu do quiz de séries.");
            return;
        }
    }
    public void executarPolicialInvestigacao() {
        System.out.println("1. Sobre Perfil Comportamental.");
        System.out.println("2. Ex-vidente.");
        System.out.println("3. Sair.");
        System.out.print("Digite sua opção:");
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            System.out.println("CRIMINAL MINDS.");
        } else if (opcao == 2) {
            System.out.println("MENTALISTA.");
        } else if (opcao == 3) {
        System.out.println("Você saiu do quiz de séries .");
            return;
    }
    }

    public void executarAcao() {
        System.out.println("1. Lutas pelo trono, envolvendo várias famílias.");
        System.out.println("2. Vida das mulheres na prisão.");
        System.out.println("3. Sair.");
        System.out.print("Digite sua opção:");
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            System.out.println("GAME OF THRONES.");
        } else if (opcao == 2) {
            System.out.println("ORANGE IS THE NEW BLACK.");
    } else if (opcao == 3) {
        System.out.println("Você saiu do quiz de séries.");
            return;
    }
    }

    public void executarComedia() {
        System.out.println("1. Grupo de amigos Nerds.");
        System.out.println("2. Sobre uma família que o pai cuida e protege as crianças.");
        System.out.println("3. Sair.");
        System.out.print("Digite sua opção: ");
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            System.out.println("THE BIG BANG THEORY.");
        } else if (opcao == 2) {
            System.out.println("EU, A PATROA DAS CRIANÇAS.");
        } else if (opcao == 3) {
            System.out.println("Você saiu do quiz de séries.");
            return;
        }
    }
    public void executarTerror() {
        System.out.println("1. Uma série de terror sobrenatural com fantasmas.");
        System.out.println("2. Uma série de terror psicológico e suspense.");
        System.out.println("3. Sair.");
        System.out.print("Digite sua opção: ");
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            System.out.println("Você escolheu 'The Haunting of Hill House'.");
        } else if (opcao == 2) {
            System.out.println("Você escolheu 'Hannibal'.");
        } else if (opcao == 3) {
            System.out.println("Você saiu do quiz de séries.");
            return;
        }
    }

}
