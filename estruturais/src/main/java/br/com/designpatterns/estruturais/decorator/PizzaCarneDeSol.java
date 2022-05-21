package br.com.designpatterns.estruturais.decorator;

public class PizzaCarneDeSol extends Pizza {

    public PizzaCarneDeSol() {
        this.descricao = "Pizza Carne de Sol";
        this.preco = 54;
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
