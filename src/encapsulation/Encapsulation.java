/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

import OOP.*;

/**
 *
 * @author mohammed
 */
public class Encapsulation {

    public static void main(String[] args) {
        //creating new object
        SecondClass obj = new SecondClass();
        //setting values of first object
        obj.setNum1(5);
        obj.setNum2(7);

        //creating new object
        SecondClass obj2 = new SecondClass();
        //setting values of second object

        obj2.setNum1(1);
        obj2.setNum2(3);

        // sum of first object
        obj.sum();

        // sum of second object
        obj2.sum();

    }

}
