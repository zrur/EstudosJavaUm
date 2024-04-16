package models;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String nome;
    private String artista;
    private int anoLancamento;
    private int duracao;
    // usar outra classe como atributo de uma classe é chmado de composição
    //a classe album é composta por varios musicas ou uma lista de muscias
    private List<Album>musicas = new ArrayList<>();

    public Album(){}

    public Album(String nome,String artista, int anoLancamento, List<Musica> musicas) {
        this.nome = nome;
        this.artista = artista;
        this.anoLancamento = anoLancamento;
        this.musicas = musicas
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
