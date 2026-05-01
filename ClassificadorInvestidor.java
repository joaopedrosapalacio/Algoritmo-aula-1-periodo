/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.classificadorinvestidor;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class ClassificadorInvestidor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Voce aceita riscos de perda?");
        boolean perda = scanner.nextBoolean();
        
        System.out.println("Voce busca retornos elevados?");
        boolean retorno = scanner.nextBoolean();
        
        if (perda == true && retorno == true) {
            System.out.println("Seu perfil se encaixa no cliente arrojado");
        } else if (perda == false && retorno == true) {
            System.out.println("Seu perfil se encaixa no cliente moderado");
        } else {
            System.out.println("Seu perfil se encaixa no cliente conservador");
        }
    }
}
