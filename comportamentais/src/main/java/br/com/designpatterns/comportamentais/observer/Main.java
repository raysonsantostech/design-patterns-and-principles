package br.com.designpatterns.comportamentais.observer;

public class Main {
    public static void main(String[] args) {
        NewsLetter newsLetter = new NewsLetter();

        Cliente cliente1 = new Cliente("Cliente 1", "cliente1@mail.com", newsLetter);
        Cliente cliente2 = new Cliente("Cliente 2", "cliente2@mail.com", newsLetter);

        System.out.println("############################################");
        newsLetter.addMensagem("Sejam todos bem-vindos!!!");

        Parceiro parceiro1 = new Parceiro("Parceiro 1", "parceiro1@mail.com", newsLetter);

        System.out.println("############################################");
        newsLetter.addMensagem("Novas atualizações!!!");

    }
    
}
