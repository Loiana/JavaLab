/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab;

/**
 *
 * @author aluno
 */
public class TestaArmagedon {
    public static void main(String[] args) {
        Armagedon arm = new Armagedon();
        System.out.println(arm.getGuerreiros());
        //arm.setGuerreiros(2000);
        
        System.out.println(arm.getGuerreiros());
        
        Armagedon fimDoMundo = (Armagedon) arm.clone();
        
        if (arm.equals(fimDoMundo)){ // Ou seja, equals(a,b) -> a.equals(b)
            
        }
        
        System.out.println(arm.toString());
        
        System.out.println(arm.hashCode());
                        
        System.out.println(arm.getClass());
        
        Class c = arm.getClass(); //Reflexão
    }
    
}
