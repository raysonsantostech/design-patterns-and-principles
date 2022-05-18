package br.com.designpatterns.comportamentais.strategy;

public class Pedido {

    private float valor;
    private Frete tipoFrete;

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setTipoFrete(Frete tipoFrete) {
        this.tipoFrete = tipoFrete;
    }

    public float calcular() {
        return tipoFrete.calcular(this.valor);
    }

}
