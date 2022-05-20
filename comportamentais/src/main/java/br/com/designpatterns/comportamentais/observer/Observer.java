package br.com.designpatterns.comportamentais.observer;

public interface Observer {
    void update(String mensagem);

    String getNome();

    String getEmail();
    
}
