package br.com.designpatterns.estruturais.decorator;

public class PizzaCalabresa extends Pizza {

    public PizzaCalabresa() {
        this.descricao = "Pizza Calabresa";
        this.preco = 42;
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
