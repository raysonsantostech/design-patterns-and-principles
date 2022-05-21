package br.com.designpatterns.estruturais.decorator;

public abstract class Pizza {
    protected String descricao = "Descrição indefinida.";
    protected float preco;

    public abstract String getDescricao();

    public abstract float getPreco();
}
