package br.com.alura.linguagens.api;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "principaisLinguagens")
public class Linguagem {

  @Id
  private String id;
  private String nome;
  private String imagem;
  private int posicao;

  public Linguagem() {

  }

  public Linguagem(String nome, String image, int posicao) {
    this.nome = nome;
    this.imagem = image;
    this.posicao = posicao;
  }

  public String getId() {
    return id;
  }

  public String getNome() {
    return nome;
  }

  public String getImagem() {
    return imagem;
  }

  public int getPosicao() {
    return posicao;
  }
}