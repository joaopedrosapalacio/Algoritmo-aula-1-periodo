/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.senha;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Senha {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int senhaCorreta = 1234;
        System.out.println("Digite uma senha");
        int senha = scanner.nextInt();
        
        if (senha == senhaCorreta){
            System.out.println("Acesso concedido");
        } 
        else {
            System.out.println("Acesso negado");
        }
    }
}
