/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program;

import entidades.Conta;
import entities.Conta;
import java.util.Scanner;

/**
 *
 * @author João Paulo
 */
public class Aplicacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta conta;
        
        System.out.println("Entre com o número da cont:");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Entre com o titular da conta:");
        String nome = sc.nextLine();
        System.out.println("Deseja realizar depósito inicial?");
        char resposta = sc.next().charAt(0);
        if(resposta == 's') {
            System.out.println("Qual o valor do deposito?");
            double valorInicial = sc.nextDouble();
            
            conta = new Conta (numero, nome, valorInicial);
        } else {
            conta = new Conta(numero, nome);
        }
        
        System.out.println("");
        System.out.println("Dados da Conta:");
        System.out.println(conta);
        
        System.out.println("");
        
        System.out.println("Quanto deseja sacar?");
        double valor = sc.nextDouble();
        conta.sacar(valor);
        
        System.out.println("");
        
        System.out.println("Dados atualizados:");
        System.out.println(conta);
        
        System.out.println("Quanto deseja depositar?");
        valor = sc.nextDouble();
        conta.depositar(valor);
        
        System.out.println(conta);
        
        Conta contaDestino = new Conta(321, "Luiza", 1.000);
        System.out.println("");
        System.out.println("Dados da conta 2");
        System.out.println(contaDestino);
        
        conta.transferir(contaDestino, 2000);
        
        System.out.println("Dados da Conta");
        System.out.println(conta);
    }
}