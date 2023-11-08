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
public class Akinator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Serie serieAdivinhada = new Serie("Nome da Série"); // Substitua "Nome da Série" pelo nome real da série


        Serie peakyBlinders = new Serie("Peaky Blinders");
        Serie laCasaDePapel = new Serie("La Casa de Papel");
        Serie lupin = new Serie("Lupin");
        Serie gameOfThrones = new Serie("Game of Thrones");
        Serie coisaMaisLinda = new Serie("Coisa Mais Linda");
        Serie criminalMinds = new Serie("Criminal Minds");
        Serie cidadeInvisivel = new Serie("Cidade Invisivel");
        Serie sintonia = new Serie("Sintonia");
        Serie orangeIsTheNewBlack = new Serie("Orange Is The New Black");
        Serie oMentalista = new Serie("O Mentalista");
        Serie theBigBangTheory = new Serie("The Big Bang Theory");


        System.out.println("Akinator - Adivinhe a série!");
        System.out.println("Responda às seguintes perguntas para adivinhar a série:");

        // Pergunta 1
        System.out.println("Em qual país essa série está ambientada?");
        System.out.println("a) Reino Unido");
        System.out.println("b) Espanha");
        System.out.println("c) França");
        System.out.println("d) Brasil");
        System.out.println("e) USA");
        String pais = scanner.nextLine();
        serieAdivinhada.setPais(pais);

        // Pergunta 2
        System.out.println("Qual é a temática principal da série?");
        System.out.println("a) Gangues após a Primeira Guerra Mundial");
        System.out.println("b) Assaltos espetaculares");
        System.out.println("c) Perfil comportamental e investigação de crimes");
        System.out.println("d) Vida de mulheres empreendedoras na década de 1950");
        System.out.println("e) Nenhuma dessas");
        String tematica = scanner.nextLine();
        serieAdivinhada.setTematica(tematica);

        // Pergunta 3
        System.out.println("3. A série se passa em um ambiente urbano ou rural?");
        System.out.println("a) Urbano");
        System.out.println("b) Rural");
        System.out.println("c) Uma mistura de ambos");
        System.out.println("d) Não tenho certeza");
        System.out.println("e) Nenhuma das alternativas");
        String ambiente = scanner.nextLine();
        serieAdivinhada.setAmbiente(ambiente);

        // Continue para as perguntas 4 a 11, adaptando o código conforme necessário.

        // Pergunta 4
        System.out.println("4. Qual é a época em que a série se passa?");
        System.out.println("a) Pós-Primeira Guerra Mundial");
        System.out.println("b) Século XXI");
        System.out.println("c) Época histórica anterior ao século XX");
        System.out.println("d) Década de 1950");
        System.out.println("e) Não sei");
        String epoca = scanner.nextLine();
        serieAdivinhada.setEpoca(epoca);

        // Pergunta 5
        System.out.println("5. Qual é o elemento central da trama?");
        System.out.println("a) Criminosos após a Primeira Guerra Mundial");
        System.out.println("b) Assaltos espetaculares à Casa da Moeda");
        System.out.println("c) Estudo de perfis comportamentais");
        System.out.println("d) Empoderamento de mulheres empreendedoras");
        System.out.println("e) Nenhum desses");
        String elementoCentral = scanner.nextLine();
        serieAdivinhada.setElementoCentral(elementoCentral);

        // Pergunta 6
        System.out.println("6. A série é centrada em um grupo de amigos e suas interações sociais?");
        System.out.println("a) Sim");
        System.out.println("b) Não");
        System.out.println("c) Às vezes");
        System.out.println("d) Não tenho certeza");
        System.out.println("e) Nenhuma das alternativas");
        String grupoDeAmigos = scanner.nextLine();
        serieAdivinhada.setGrupoDeAmigos(grupoDeAmigos);

        // Pergunta 8
        System.out.println("8. O protagonista da série é um detetive ou investigador?");
        System.out.println("a) Sim");
        System.out.println("b) Não");
        System.out.println("c) Às vezes");
        System.out.println("d) Não sei");
        System.out.println("e) Nenhuma das alternativas");
        String detetive = scanner.nextLine();
        serieAdivinhada.setDetetive(detetive);

        // Pergunta 9
        System.out.println("9. Qual é o gênero da série?");
        System.out.println("a) Drama histórico");
        System.out.println("b) Assalto e crime");
        System.out.println("c) Drama criminal");
        System.out.println("d) Drama urbano");
        System.out.println("e) Comédia e nerdice");
        String genero = scanner.nextLine();
        serieAdivinhada.setGenero(genero);

        // Pergunta 10
        System.out.println("10. A trama da série acontece em um ambiente histórico específico?");
        System.out.println("a) Sim");
        System.out.println("b) Não");
        System.out.println("c) Em alguns momentos");
        System.out.println("d) Não sei");
        System.out.println("e) Nenhuma das alternativas");
        String ambienteHistorico = scanner.nextLine();
        serieAdivinhada.setAmbienteHistorico(String.valueOf(ambienteHistorico));


        String serieAdivinhadaNome = serieAdivinhada.adivinharSerie();

        System.out.println("A série adivinhada é: " + serieAdivinhadaNome);

    }
}
