/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab;

/**
 *
 * @author aluno
 */
public class Fatura implements Pagavel {
    private String tipoItem;
    private String descricaoItem;
    private int quantidade;
    private double precoUnitario;
    
    public Fatura(String item, String descricao, int conta, double preco) {
        tipoItem = item;
        descricaoItem = descricao;
        quantidade = conta;
        precoUnitario = preco;
    }
    
    @Override
    public double getValorASerPago() {
        return quantidade * precoUnitario;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
