package br.com.designpatterns.estruturais.decorator;

public class MassaArtesanal extends AcrescimoPizza {

    public MassaArtesanal(Pizza pizza) {
        super(pizza);
        this.descricao = " + Massa Artesanal";
        this.preco = 10;
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
