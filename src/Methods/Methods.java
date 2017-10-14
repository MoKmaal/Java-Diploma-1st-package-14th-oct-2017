/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

/**
 *
 * @author mohammed
 */
public class Methods {

    public static void main(String[] args) {
        int x = 5;
        // we need to calculate 5!   
        // the result must be 5*4*3*2*1
        //using method that we will pass variable 'x' and return the result
        int result = factorial(x);
        System.out.print("factorial x = ");
        System.out.println(result);
        // we need to calculate 7!   
        // the result must be 7*6*5*4*3*2*1
        //using method that we will pass variable 'x' and return the result

        int y = 7;
        int newResult = factorial(y);
        System.out.print("factorial y = ");
        System.out.println(newResult);

    }

    public static int factorial(int val) {
        int factorial = 1;
        for (int counter = 1; counter <= val; counter++) {
            factorial *= counter;

        }
        return factorial;
    }
}
