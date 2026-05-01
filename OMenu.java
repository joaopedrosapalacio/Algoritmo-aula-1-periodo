/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.omenu;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class OMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int escolha = 1;
        
        do {
            System.out.println("Digite 1 para jogar, 2 para opcoes, 3 para sair");
            escolha = scanner.nextInt();
            
        } while (escolha != 3);
        System.out.println("Selecione sua opcao novamente");
        
        System.out.println("Voce saiu do programa");
    }
}
