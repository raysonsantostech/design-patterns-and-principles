package br.com.designpatterns.comportamentais.strategy;

public class FreteComun implements Frete {

    @Override
    public float calcular(float valor) {
        return valor * 0.1f;
    }

}
