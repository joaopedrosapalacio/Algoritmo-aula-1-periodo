/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.levantamentomultibanco;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class LevantamentoMultiBanco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Me informe seu saldo atual");
        int saldo = scanner.nextInt();
        
        System.out.println("Qual e o seu saque pretendido?");
        int saque = scanner.nextInt();
        
        if (saque <= saldo){
            System.out.println("Transacao autorizada");
        }
        else{
            System.out.println("saldo insuficiente");
        }
    }
}
