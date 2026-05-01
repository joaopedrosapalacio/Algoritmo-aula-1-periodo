/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.caixaeletronicocontinuo;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class CaixaEletronicoContinuo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double troco;
        int i = 1;
        
        while (i == 1){
           
        System.out.println("Qual e o saldo atual?");
        double saldo = scanner.nextInt();
        
        System.out.println("Qual e o saque pretendido");
        double saque = scanner.nextInt();
        
        if (saque <= saldo) {
            System.out.println("Transacao autorizada");
            troco = saldo - saque;
            System.out.println("Seu troco e " + troco);
        
        } else {
            System.out.println("Transacao bloqueada");
        }
        System.out.println("Novo clinte se aproximando? (1 - Sim, 0- Nao)");
        i = scanner.nextInt();
        }
    }
}
