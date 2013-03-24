/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab;

/**
 *
 * @author aluno
 */
public class Funcionario implements Pagavel{
    private double salario; //este campo nao é nem visto em outras classes e nem herdado em subclasses.
    protected double salario2;//Funciona como um private, mas PODE ser utilizado na herança assim como em qualque classe deste mesmo pacote.
    double salario3; //nao escrever nada e como public, mas somente no mesmo pacote.
    public double salario4;
    
    
    public Funcionario () {
        salario = 719.00;
    }
    
    private double demitir() {
        return 30000.00;
    }
    
    protected void demitir2() {
   
    }
      
    protected final void demitir3() {
   
    }
    
    @Override
    public double getValorASerPago() {
        return salario;
    }
}
