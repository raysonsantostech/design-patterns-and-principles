package br.com.designpatterns.comportamentais.observer;

public class Parceiro implements Observer {
    private String nome;
    private String email;
    private Subject subject;

    public Parceiro(String nome, String email, Subject subject) {
        this.nome = nome;
        this.email = email;
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void update(String mensagem) {
        Email.enviar(this.email, this.nome, mensagem);
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public String getEmail() {
        return this.email;
    }    
    
}
