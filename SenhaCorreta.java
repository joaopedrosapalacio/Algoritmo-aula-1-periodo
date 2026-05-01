/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.senhacorreta;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class SenhaCorreta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite uma senha");
        int senha = scanner.nextInt();
        int i = 1;
        
        while (senha != 1234) {
            System.out.println("Senha incorreta, tente novamente");
            senha = scanner.nextInt();
            i++;
        }
        System.out.println("Senha correta");
    } 
}
