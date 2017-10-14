package casting;

/**
 *
 * @author mohammed
 */
public class Casting {

    public static void main(String[] args) {

        //Up casting
        byte byteNumber = 120;
        int integerNumber = byteNumber;
        System.out.println("Up Casting");
        System.out.println(integerNumber);

        //Down casting
        int integerNumber1 = 120;
        byte byteNumber1 = (byte) integerNumber1;
        System.out.println("Down Casting");
        System.out.println(byteNumber1);

        //Down casting with overflow
        int integerNumber2 = 129;
        byte byteNumber2 = (byte) integerNumber2;
        System.out.println("Down Casting with overflow");
        System.out.println(byteNumber2);

    }

}
