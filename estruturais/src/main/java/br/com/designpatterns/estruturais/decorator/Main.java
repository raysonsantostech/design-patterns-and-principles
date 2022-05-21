package br.com.designpatterns.estruturais.decorator;

public class Main {
    public static void main(String[] args) {
        Pizza pizzaCarneDeSol = new PizzaCarneDeSol();
        
        System.out.println("Descrição: " + pizzaCarneDeSol.getDescricao());
        System.out.println("Preço: " + pizzaCarneDeSol.getPreco() + " R$");
        System.out.println("############################################################");

        Pizza pizzaCarneDeSolComBordaDeCheddar = new BordaDeCheddar(pizzaCarneDeSol);

        System.out.println("Descrição: " + pizzaCarneDeSolComBordaDeCheddar.getDescricao());
        System.out.println("Preço: " + pizzaCarneDeSolComBordaDeCheddar.getPreco() + " R$");
        System.out.println("############################################################");


        Pizza pizzaCarneDeSolComBordaDeCheddarComMassaArtesanal = new MassaArtesanal(pizzaCarneDeSolComBordaDeCheddar);

        System.out.println("Descrição: " + pizzaCarneDeSolComBordaDeCheddarComMassaArtesanal.getDescricao());
        System.out.println("Preço: " + pizzaCarneDeSolComBordaDeCheddarComMassaArtesanal.getPreco() + " R$");
        System.out.println("############################################################");


    }
}
