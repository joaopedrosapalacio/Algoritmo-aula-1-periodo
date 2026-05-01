/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hublogisticaautomatizado;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class HubLogisticaAutomatizado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int id[] = new int [15];
        int peso[] = new int [15];
        int i;
        int soma = 0;
        int maiorPeso = peso[0];
        int menorPeso = peso[0];
        int maiorId = id[0];
        int menorId = id[0];
        int media;
        int idBusca;
        boolean encontrou;
        
        for (i = 0; i < id.length; i++) {
            System.out.println("Digite o id");
            id[i] = scanner.nextInt();
            System.out.println("Digite o peso");
            peso[i] = scanner.nextInt();
            
            soma += peso[i];
            
            if (peso[i] > 1000){
                System.out.println("PESADA");
            } else {
                System.out.println("LEVE");
            }
            media = soma / 15;
            System.out.println("A soma dos pesos e: " + soma);
            System.out.println("A media deles e de: " + media);
        }
        for (i = 0; i < peso.length;i++) {
            if (peso[i] > maiorPeso){
                maiorPeso = peso[i];
                maiorId = id[i];
            } else if (peso[i] < menorPeso) {
                menorPeso = peso[i];
                menorId = id[i];
            }
        }
        System.out.println("Maior peso: " + maiorPeso + " Seu id e " + maiorId);
        System.out.println("Menor peso: " + menorPeso + " Seu id e " + menorId);
        do {
            System.out.println("Digite um id (digite -1 para sair)");
            idBusca = scanner.nextInt();
            
            if (idBusca != -1) {
                encontrou = false;
                
                for (i = 0; i < id.length; i++) {
                    if (id[i] == idBusca) {
                        System.out.println("Carga encontrada");
                        System.out.println("Peso: " + peso[i]);
                        encontrou = true;
                    }
                }
                if (!encontrou) {
                    System.out.println("Id nao encontrado");
                }
            }
        } while (idBusca != -1);
    }
}
