/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author GERAL
 */
public class Conta {
    
    private int numero;
    private String titular;
    private double saldo;
    
    public Conta() {
    }

    public Conta(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public Conta(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public boolean sacar(double valor) {
        if(valor <- saldo){
            saldo =- valor;
            return true;
        }else{
            if(valor + 5.0> saldo){
            System.out.println("Saldo insuficiente");
            System.out.println("Saldo atual: "+getSaldo ());
            return false;
        }else{
                saldo -= valor+5.0;
                
                return true;
        }
    }
    public void depositar(double valor){
        saldo +valor;
    }
public void transferir(Conta conta, double valor) {
    this.sacar(valor);
    conta.depositar(valor);
}
    @Override
    public String toString() {
        return "Conta{" + "numero=" + numero + ", titular=" + titular + ", saldo=" + saldo + '}';
    }
    
}
