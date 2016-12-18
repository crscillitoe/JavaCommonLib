package JavaCommonLib;

import java.util.Objects;

/**
 * Created by ftlc on 12/17/16.
 */
public class Main {


    public static void main(String args[]) {

        int[] test = new int[6];

        for(int i = 0; i < 6; i++){
            test[i] = i;
        }


        System.out.println(JavaArrays.ArrayToString(test));
        test = JavaArrays.ArrayChangeSize(test, 10);
        System.out.println(JavaArrays.ArrayToString(test));
        test = JavaArrays.ArrayChangeSize(test, 3);
        System.out.println(JavaArrays.ArrayToString(test));



        boolean[] testBool = new boolean[6];

        for(int i = 0; i < 6; i++){
            testBool[i] = true;
        }


        System.out.println(JavaArrays.ArrayToString(testBool));
        testBool = JavaArrays.ArrayChangeSize(testBool, 10);
        System.out.println(JavaArrays.ArrayToString(testBool));
        testBool = JavaArrays.ArrayChangeSize(testBool, 3);
        System.out.println(JavaArrays.ArrayToString(testBool));


        char[] testChar = new char[6];

        for(int i = 0; i < 6; i++){
            testChar[i] = 'a';
        }


        System.out.println(JavaArrays.ArrayToString(testChar));
        testChar = JavaArrays.ArrayChangeSize(testChar, 10);
        System.out.println(JavaArrays.ArrayToString(testChar));
        testChar = JavaArrays.ArrayChangeSize(testChar, 3);
        System.out.println(JavaArrays.ArrayToString(testChar));


        double[] testDouble = new double[6];

        for(int i = 0; i < 6; i++){
            testDouble[i] = 3.5;
        }


        System.out.println(JavaArrays.ArrayToString(testDouble));
        testDouble = JavaArrays.ArrayChangeSize(testDouble, 10);
        System.out.println(JavaArrays.ArrayToString(testDouble));
        testDouble = JavaArrays.ArrayChangeSize(testDouble, 3);
        System.out.println(JavaArrays.ArrayToString(testDouble));




    }


}
