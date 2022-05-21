package br.com.designpatterns.estruturais.decorator;

public abstract class AcrescimoPizza extends Pizza {

    protected Pizza pizza;

    public AcrescimoPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public abstract String getDescricao();

    public abstract float getPreco();
    
}
