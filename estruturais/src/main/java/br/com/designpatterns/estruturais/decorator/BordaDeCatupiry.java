package br.com.designpatterns.estruturais.decorator;

public class BordaDeCatupiry extends AcrescimoPizza {

    public BordaDeCatupiry(Pizza pizza) {
        super(pizza);
        this.descricao = " + Borda de Catupiry";
        this.preco = 2.7f;
    }

    @Override
    public String getDescricao() {
        return this.pizza.getDescricao() + this.descricao;
    }

    @Override
    public float getPreco() {
        return this.pizza.getPreco() + this.preco;
    }
    
}
