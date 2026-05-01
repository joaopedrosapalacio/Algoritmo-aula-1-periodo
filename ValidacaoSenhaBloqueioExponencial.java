/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.validacaosenhabloqueioexponencial;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class ValidacaoSenhaBloqueioExponencial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int senha = 2026;
        int i = 3;
        int tentativa;
        boolean bloqueador = false;
        boolean acerto = false;
        
        do {
            System.out.println("Digite a senha");
            tentativa = scanner.nextInt();
            
            if (tentativa == senha){
               System.out.println("Acesso liberado");
               acerto = true;
            } else {
                i--;
                
                if (i == 0) {
                    System.out.println("Aguarde um momento");
                    bloqueador = true;
                    i = 1;
                }
            }
        } while (!acerto);
        
    }
}
