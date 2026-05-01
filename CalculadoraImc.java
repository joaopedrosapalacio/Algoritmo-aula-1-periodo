/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoraimc;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class CalculadoraImc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Qual e o seu peso?");
        double peso= scanner.nextDouble();
        
        System.out.println("Qual e a sua altura?");
        double altura= scanner.nextDouble();
        
        double imc = (peso / (altura * altura));
        System.out.printf("Seu imc e igual a " + imc);
        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Normal");
        } else if (imc < 30) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidade");
        }
    }
}
