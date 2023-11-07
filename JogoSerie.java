/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.dobackaofront.trabalhopoo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;


/**
 *
 * @author Dieuphenson
 */
public class JogoSerie {
    private List<Pergunta> perguntas;
    private String resposta;
    
    public JogoSerie(){
        perguntas = new ArrayList<>();
        // Adicione as perguntas aqui
        perguntas.add(new Series ("Em qual país essa serie está ambientada ?","Reinu Unido","Espanha", "França","Brasil","USA" 'a','b','c','d','e'));
        perguntas.add(new Series("Qual é a termática principal da serie"))
    }

    void iniciarPergunta() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
