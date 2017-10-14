/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conditions;

/**
 *
 * @author mohammed
 */
public class Conditions {

    public static void main(String[] args) {
        int x = 5;
        System.out.println("IF ELSE");
        if (x > 4) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        System.out.println("");
        System.out.println("");

        System.out.println("IF ELSEIF ELSE");
        if (x > 5) {
            System.out.println("X is greater than 5");
        } else if (x < 5) {
            System.out.println("X is smaller than 5");
        } else {
            System.out.println("X equal 5");
        }

        System.out.println("");
        System.out.println("");

        System.out.println("Anding Operation &&");
        if (x > 4 && x < 7) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        System.out.println("");
        System.out.println("");

        System.out.println("OR Operation ||");
        if (x > 10 || x < 7) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        System.out.println("");
        System.out.println("");

        System.out.println("Not equal  Operation !=");
        if (x != 4) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        System.out.println("");
        System.out.println("");

        System.out.println("Equal  Operation ==");
        if (x == 5) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

}
