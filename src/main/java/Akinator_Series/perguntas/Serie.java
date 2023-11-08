
package Akinator_Series.perguntas;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Dieuphenson
 */
public class Serie {

    private String nome;
    private String pais;
    private String tematica;
    private String ambiente;
    private String epoca;
    private String elementoCentral;
    private String grupoDeAmigos;
    private String detetive;
    private String genero;
    private String ambienteHistorico;

    public Serie(String nome) {
        this.nome = nome;
        pais = "";
        tematica = "";
        ambiente = "";
        epoca = "";
        elementoCentral = "";
        grupoDeAmigos = "";
        detetive = "";
        genero = "";
        ambienteHistorico = "";
    }

    public String getPais() {
        return pais;
    }

    public String getTematica() {
        return tematica;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public String getEpoca() {
        return epoca;
    }

    public String getElementoCentral() {
        return elementoCentral;
    }

    public String getGrupoDeAmigos() {
        return grupoDeAmigos;
    }

    public String getDetetive() {
        return detetive;
    }

    public String getGenero() {
        return genero;
    }

    public String getAmbienteHistorico() {
        return ambienteHistorico;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public void setEpoca(String epoca) {
        this.epoca = epoca;
    }

    public void setElementoCentral(String elementoCentral) {
        this.elementoCentral = elementoCentral;
    }

    public void setGrupoDeAmigos(String grupoDeAmigos) {
        this.grupoDeAmigos = grupoDeAmigos;
    }

    public void setDetetive(String detetive) {
        this.detetive = String.valueOf(detetive);
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAmbienteHistorico(String ambienteHistorico) {
        this.ambienteHistorico = String.valueOf(ambienteHistorico);
    }
    public String adivinharSerie() {
        if (pais.equals("Reino Unido") && tematica.equals("Gangues após a Primeira Guerra Mundial") && ambiente.equals("Urbano") && epoca.equals("Pós-Primeira Guerra Mundial") && elementoCentral.equals("Criminosos após a Primeira Guerra Mundial") && grupoDeAmigos.equals("Não") && detetive.equals("Não") && genero.equals("Drama histórico") && ambienteHistorico.equals("Sim")) {
            return "Peaky Blinders";
        } else if (pais.equals("Espanha") && tematica.equals("Assaltos espetaculares") && ambiente.equals("Urbano") && epoca.equals("Século XXI") && elementoCentral.equals("Assaltos espetaculares à Casa da Moeda") && grupoDeAmigos.equals("Não") && detetive.equals("") && genero.equals("Assalto e crime") && ambienteHistorico.equals("Não")) {
            return "La Casa de Papel";
        } else if (pais.equals("USA") && tematica.equals("Perfil comportamental e investigação de crimes") && ambiente.equals("Urbano") && epoca.equals("Século XXI") && elementoCentral.equals("Estudo de perfis comportamentais") && grupoDeAmigos.equals("Não") && detetive.equals("Sim") && genero.equals("Drama urbano") && ambienteHistorico.equals("Não")) {
            return "Criminal Minds";
        } else if (pais.equals("Brasil") && tematica.equals("Vida de mulheres empreendedoras na década de 1950") && ambiente.equals("Urbano") && epoca.equals("Década de 1950") && elementoCentral.equals("Empoderamento de mulheres empreendedoras") && grupoDeAmigos.equals("Não") && detetive.equals("Não") && genero.equals("Drama urbano") && ambienteHistorico.equals("Sim")) {
            return "Coisa Mais Linda";
        } else if (pais.equals("Brasil") && tematica.equals("Nenhuma dessas") && ambiente.equals("Urbano") && epoca.equals("Século XXI") && elementoCentral.equals("Nenhum desses") && grupoDeAmigos.equals("Sim") && detetive.equals("Não") && genero.equals("Drama urbano") && ambienteHistorico.equals("Não")) {
            return "Sintonia";
        } else if (pais.equals("USA") && tematica.equals("Nenhuma dessas") && ambiente.equals("Urbano") && epoca.equals("Século XXI") && elementoCentral.equals("Nenhum desses") && grupoDeAmigos.equals("Sim") && detetive.equals("Não") && genero.equals("Comédia e nerdice") && ambienteHistorico.equals("Não")) {
            return "The Big Bang Theory";
        } else if (pais.equals("USA") && tematica.equals("Nenhuma dessas") && ambiente.equals("Urbano") && epoca.equals("Século XXI") && elementoCentral.equals("Nenhum desses") && grupoDeAmigos.equals("Sim") && detetive.equals("Não") && genero.equals("Drama urbano") && ambienteHistorico.equals("Não")) {
            return "O Mentalista";
        } else if (pais.equals("USA") && tematica.equals("Nenhuma dessas") && ambiente.equals("Urbano") && epoca.equals("Século XXI") && elementoCentral.equals("Nenhum desses") && grupoDeAmigos.equals("Sim") && detetive.equals("Não") && genero.equals("Drama urbano") && ambienteHistorico.equals("Não")) {
            return "Orange Is the New Black";
        } else if (pais.equals("Brasil") && tematica.equals("Nenhuma dessas") && ambiente.equals("Urbano") && epoca.equals("Século XXI") && elementoCentral.equals("Nenhum desses") && grupoDeAmigos.equals("Sim") && detetive.equals("Não") && genero.equals("Drama urbano") && ambienteHistorico.equals("Não")) {
            return "Cidade Invisível";
        } else if (pais.equals("França") && tematica.equals("Nenhuma dessas") && ambiente.equals("Urbano") && epoca.equals("Século XXI") && elementoCentral.equals("Nenhum desses") && grupoDeAmigos.equals("Sim") && detetive.equals("Não") && genero.equals("Drama urbano") && ambienteHistorico.equals("Não")) {
            return "Lupin";
        } else if (pais.equals("USA") && tematica.equals("Nenhuma dessas") && ambiente.equals("Nenhuma das alternativas") && epoca.equals("Época histórica anterior ao século XX") && elementoCentral.equals("Nenhum desses") && grupoDeAmigos.equals("Não") && detetive.equals("Não") && genero.equals("Drama histórico") && ambienteHistorico.equals("Sim")) {
            return "Game of Thrones";
        } else {
            return "Série não identificada";
        }
    }
}
