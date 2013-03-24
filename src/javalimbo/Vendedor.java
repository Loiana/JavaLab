/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javalimbo;

import javalab.Funcionario;

/**
 *
 * @author aluno
 */
public class Vendedor extends Funcionario{
    private double comissao;
    
    public Vendedor() {
        super();
        comissao = 200.00;
    }
    
    public double ganhos() {
        return salario2 + comissao;
    }
}
