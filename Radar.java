/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.radar;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Radar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Coloque a velocidade do carro");
        int velocidade = scanner.nextInt();
        if (velocidade > 120){
            System.out.println("Multado por excesso de velocidade");
        } else {
            System.out.println("Boa viagem, velocidade adequada");
        }
    }
}
