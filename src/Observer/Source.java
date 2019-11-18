package Observer;

import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jit
 */
public class Source {

    private String data;
    private List<Observer> observers
            = new ArrayList<Observer>();

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
        notifyObserver();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

}
