package br.com.designpatterns.estruturais.decorator;

public class PizzaTresQueijos extends Pizza {

    public PizzaTresQueijos() {
        this.descricao = "Pizza Três Queijos";
        this.preco = 49;
    }

    @Override
    public String getDescricao() {
        return this.descricao;
    }

    @Override
    public float getPreco() {
        return this.preco;
    }
    
}
