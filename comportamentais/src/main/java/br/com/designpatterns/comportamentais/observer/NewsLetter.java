package br.com.designpatterns.comportamentais.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsLetter implements Subject {
    private List<Observer> observers;
    private List<String> mensagens;

    public NewsLetter() {
        observers = new ArrayList<Observer>();
        mensagens = new ArrayList<String>();
    }

    public void addMensagem(String mensagem) {
        this.mensagens.add(mensagem);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observers.indexOf(observer));
    }

    @Override
    public void notifyObservers() {
        String ultimaMensagem = mensagens.get(mensagens.size()-1);
        for (Observer observer : observers) {
            observer.update(ultimaMensagem);
        }                
    }

    
}
