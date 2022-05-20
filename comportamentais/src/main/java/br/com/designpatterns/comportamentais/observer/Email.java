package br.com.designpatterns.comportamentais.observer;

public class Email {
    public static void enviar(String email, String nome, String mensagem) {
        System.out.println("Enviado para " + email + " - " + nome);
        System.out.println(mensagem);
    }
}
