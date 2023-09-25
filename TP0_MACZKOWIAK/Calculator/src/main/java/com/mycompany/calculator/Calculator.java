/*
* Nom: Paul Maczkowiak
* Groupe: TDC
* TP0 Exercice 3
* Date: 18/09/23
 */
package com.mycompany.calculator;

import java.util.Scanner;

/**
 *
 * @author lukha
 */
public class Calculator {

    public static void main(String[] args) {
        int operateur, operande1, operande2;
        double result = 0;

        //Selection opérateur
        System.out.println("""
                           Please enter the operator: 
                           1) add 
                           2) subtract 
                           3) multiply 
                           4) divide 
                           5) modulo""");
        Scanner sc = new Scanner(System.in);
        operateur = sc.nextInt();
        if (operateur < 0 || operateur > 5) {
            System.out.println("Please choose a number corresponding to an operator");
            System.exit(0);
        }

        //Selection nombre
        System.out.println("Please choose a number");
        operande1 = sc.nextInt();
        System.out.println("Please choose a second number");
        operande2 = sc.nextInt();

        //Calcul
        if (operateur == 1) {
            result = operande1 + operande2;
        }
        if (operateur == 2) {
            result = operande1 - operande2;
        }
        if (operateur == 3) {
            result = operande1 * operande2;
        }
        if (operateur == 4) {
            result = operande1 / operande2;
        }
        if (operateur == 5) {
            result = operande1 % operande2;
        }
        System.out.println("The result is : " + result);
    }
}
