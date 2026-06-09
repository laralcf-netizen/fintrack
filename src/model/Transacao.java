/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lara
 */
public class Transacao {
    private String descricao;
    private double valor;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    private String tipo;
    
    public Transacao (String descricao, double valor, String tipo){
                this.descricao = descricao;
                this.valor = valor;
                this.tipo = tipo;
    }
    @Override
    public String toString (){
        return "Tipo: " + tipo + 
                "| Descrição: " + descricao +
                "| Valor: R$ " + valor;
    }
}

