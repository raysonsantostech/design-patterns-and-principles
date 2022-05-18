package br.com.designpatterns.comportamentais.strategy;

public class FreteExpresso implements Frete {

    @Override
    public float calcular(float valor) {
        return valor * 0.15f;
    }
    
}
