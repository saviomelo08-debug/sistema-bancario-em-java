package com.mycompany.javapoo;
import java.util.Scanner;



class javapoo {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria();
        
        Scanner Leitor = new Scanner(System.in);
        System.out.println("digite o nome do dono da conta:");
        String nome = Leitor.nextLine();
        c1.AbrirConta(nome,"cp");
        float valor1 = Leitor.nextInt();
        c1.depositar(valor1);
        float valor2 = Leitor.nextInt();
        c1.sacar(valor2);
        
        
        
        c1.EstadoAtual();
    }}