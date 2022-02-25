package br.ulbra.banco.classes;

import javax.swing.JOptionPane;

public class Conta { 
    public String nome;
    public String numConta;
    public int agencia;
    public double saldo;
    
    public Conta(){
        numConta = "999";
        this.saldo = 0;
        this.agencia = 1;
        this.nome = null;
    }
    public void mostrarSaldo(){
        JOptionPane.showMessageDialog(null, "Saldo: "+this.saldo);
    }
    public void depositar(double v){
        this.saldo = this.saldo+v;
    }
    public void sacar(double v){
        
        if(saldo>0){
            this.saldo = this.saldo-v;
        }else{
            JOptionPane.showMessageDialog(null, "Saldo Insuficiente!");
        }
    }
    public void status(){
        
    }
}
