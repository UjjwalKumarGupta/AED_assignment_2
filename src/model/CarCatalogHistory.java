/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author DELL
 */
public class CarCatalogHistory {
    private ArrayList<carCatalog> history;
    private String timeUpdate;
    public CarCatalogHistory(){
        this.history = new ArrayList<carCatalog>();
        
    }

    public ArrayList<carCatalog> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<carCatalog> history) {
        this.history = history;
    }
    
    public carCatalog addNewCars(){
        timeUpdate = new Date().toString();
        carCatalog newCars = new carCatalog();
        history.add(newCars);
        return newCars;
    }
    
    public carCatalog updateCars(int i, carCatalog cc) {
        timeUpdate = new Date().toString();
        history.set(i, cc);
        return cc;}

    public String getTimeUpdate() {
        return timeUpdate;
    }

    public void setTimeUpdate(String timeUpdate) {
        this.timeUpdate = timeUpdate;
    }
    
}
