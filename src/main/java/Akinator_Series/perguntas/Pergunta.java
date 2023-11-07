/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Akinator_Series.perguntas;

/**
 *
 * @author Dieuphenson
 */
public class Pergunta {
    private String pergunta;
    private String opcaoA;
    private String opcaoB;
    private String opcaoC;
    private String opcaoD;
    private String opcaoE;
    private char resposta;
    
    
    public Pergunta (String pergunta, String opcaoA,String opcaoB,String opcaoC,String opcaoD,String opcaoE, char resposta)
    {
        this.pergunta=pergunta;
        this.opcaoA=opcaoA;
        this.opcaoB=opcaoB;
        this.opcaoC=opcaoC;
        this.opcaoD=opcaoD;
        this.opcaoE=opcaoE;
        this.resposta=resposta;
    }
    
    
    public String getPergunta(){
        return pergunta;
    }
   
    
    public void exibirPergunta(){
        System.out.println(pergunta);
        System.out.println ("a)" + opcaoA);
        System.out.println ("b)" + opcaoB);
        System.out.println ("c)" + opcaoC);
        System.out.println ("d)" + opcaoD);
        System.out.println ("e)" + opcaoE);
    }
    
    
    public char getResposta (){
        return resposta;
    }
    
    public boolean verificarResposta (char respostaEscolhida){
       return respostaEscolhida == resposta;  
        
        
    }
          
    
    
}
