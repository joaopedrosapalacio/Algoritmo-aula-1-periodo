/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pocoes;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class Pocoes {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Qual e o nome do aventureiro? ");
        String nomeAventureiro = scanner.next();
        System.out.println("Quantas pocoes ira levar? ");
        int pocao = scanner.nextInt();
        double preco = 15.50;
        double totalVenda = preco * pocao;
        System.out.println("Guardião " + nomeAventureiro + ",o total é R$ " + totalVenda);

    }
}
