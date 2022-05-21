package br.com.designpatterns.estruturais.decorator;

public class BordaDeCheddar extends AcrescimoPizza {

    public BordaDeCheddar(Pizza pizza) {
        super(pizza);
        this.descricao = " + Borda de Cheddar";
        this.preco = 4.9f;
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
