package br.com.uniftec.ecommercemobile.model;

import java.io.Serializable;

/**
 * TODO: adicionar categoria
 * TODO: adicionar imagemPrincipal
 * TODO: adicionar imagens
 * */
public class Produto implements Serializable {

    private String descricao;
    private String nome;
    private Double preco;
    private Double precoDesconto;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double getPrecoDesconto() {
        return precoDesconto;
    }

    public void setPrecoDesconto(Double precoDesconto) {
        this.precoDesconto = precoDesconto;
    }
}
