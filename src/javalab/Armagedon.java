/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab;

/**
 *
 * @author aluno
 */
public class Armagedon { //extends java.lang.object //Toda classe erda isso implicitamente.
   // private final int guerreiros;
    private int guerreiros;
    
    Armagedon(){
        guerreiros = 1000;
    }

    /**
     * @return the guerreiros
     */
    public int getGuerreiros() {
        return guerreiros;
    }

    /**
     * @param guerreiros the guerreiros to set
     */
    public void setGuerreiros(int guerreiros) {
        this.guerreiros = guerreiros;
    }
    
    public final int dobraGuerreiros(){
        return guerreiros *2;
    }
    
    @Override //indica que estou sobrescrevendo um método que já existe.
    public Object clone(){
        return new Armagedon();
    }
    
    @Override //indica que estou sobrescrevendo um método que já existe.
    public String toString(){
        return "teste";
    }
    
}
