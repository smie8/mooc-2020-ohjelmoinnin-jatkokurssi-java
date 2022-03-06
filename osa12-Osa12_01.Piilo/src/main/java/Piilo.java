/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samie
 */
public class Piilo<T> {
    
    private T muuttuja;
    private boolean piilossa;

    public Piilo() {
//        this.muuttuja = new ;
        this.piilossa = false;
    }
    
//    public Piilo<T>() {
//        //this.muuttuja = new T<>();
//        this.muuttuja = new T<>();
//        this.piilossa = false;
//    }
    
    public void laitaPiiloon(T piilotettava) {
        this.muuttuja = piilotettava;
        this.piilossa = true;
    }
    
    public T otaPiilosta() {
        if (onkoPiilossa()) {
            this.piilossa = false;
            return this.muuttuja;
        } else {
            return null;
        }
    }
    
    public boolean onkoPiilossa() {
        return this.piilossa;
    }
}
