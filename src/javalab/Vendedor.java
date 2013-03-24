/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab;

/**
 *
 * @author aluno
 */
public class Vendedor extends Funcionario{
    private double comissao;
    
    Vendedor(){
        super(); //Construtor da super-classe, ou seja, funcionario. Ele já indica os salarios.
        comissao = 100.00;
    }
    
    public double ganhos() {
        return salario2 + comissao;
    }
    
    public void analisarDemissao() {
        //double calculo = demitir(); // Não podemos usar, pois é privado
        demitir2();
        demitir3();
    }
    @Override
    protected void demitir2(){
        
    }
    protected void demitir3(){
        
    }
}
