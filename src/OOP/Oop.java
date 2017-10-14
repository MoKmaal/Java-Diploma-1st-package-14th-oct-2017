/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

/**
 *
 * @author mohammed
 */
public class Oop {

    public static void main(String[] args) {
        //creating new object
        SecondClass obj = new SecondClass();
        //values of first object
        obj.num1 = 5;
        obj.num2 = 7;

        //creating new object
        SecondClass obj2 = new SecondClass();
        // values of second object

        obj2.num1 = 1;
        obj2.num2 = 3;

        // sum of first object
        obj.sum();

        // sum of second object
        obj2.sum();

    }

}
