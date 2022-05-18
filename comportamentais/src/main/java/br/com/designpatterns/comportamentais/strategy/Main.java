package br.com.designpatterns.comportamentais.strategy;

public class Main {
    public static void main(String[] args) {

        Frete freteComum = new FreteComun();
        Frete freteExpresso = new FreteExpresso();

        Pedido pedido = new Pedido();
        pedido.setValor(1000);
        pedido.setTipoFrete(freteComum);

        System.out.println("Calculadora de Frete");
        System.out.println("######################################");
        
        System.out.println("Frete comum");
        System.out.println("Valor: " + pedido.calcular());
        System.out.println("######################################");
        
        pedido.setTipoFrete(freteExpresso);
        System.out.println("Frete Expresso");
        System.out.println("Valor: " + pedido.calcular());

        
    }
}
