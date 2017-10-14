/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forLoop;

/**
 *
 * @author mohammed
 */
public class ForLoop {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");
        }

        //space
        System.out.println("");
        System.out.println("");


        /*
            *****
            *****
            *****
            *****
            *****
         */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        //space
        System.out.println("");
        System.out.println("");


        /*
            *
            **
            ***
            ****
            *****
         */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        //space
        System.out.println("");
        System.out.println("");


        /*
            *****
            ****
            ***
            **
            *
         */
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
