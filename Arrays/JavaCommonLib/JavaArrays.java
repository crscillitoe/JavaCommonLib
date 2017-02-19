package JavaCommonLib;

import javax.lang.model.type.PrimitiveType;

/**
 * Created by ftlc on 12/17/16.
 */
public class JavaArrays {



    /**
     * Accepts an array of characters and converts it to a string.
     * @param toPrint array to convert
     * @return the converted string
     */
    public static String ArrayToString(char [] toPrint) {

        String pretty = "[";
        Integer.
        for(int i = 0; i<toPrint.length - 1; i++){
            pretty += toPrint[i] + ", ";
        }
        pretty += toPrint[toPrint.length - 1] + "]";



        return pretty;
    }

    /**
     * Accepts an array of objects and converts it to a string.
     * @param toPrint array to convert
     * @return the converted string
     */
    public static String ArrayToString(Object[] toPrint) {

        String pretty = "[";
        for(int i = 0; i<toPrint.length - 1; i++){
            pretty += toPrint[i].toString() + ", ";
        }
        pretty += toPrint[toPrint.length - 1] + "]";


        return pretty;
    }



    /**
     * Accepts an array of integers and converts it to a string.
     * @param toPrint array to convert
     * @return the converted string
     */
    public static String ArrayToString(int[] toPrint) {

        String pretty = "[";
        for (int i = 0; i < toPrint.length - 1; i++) {
            pretty += toPrint[i] + ", ";
        }
        pretty += toPrint[toPrint.length - 1] + "]";

        return pretty;
    }



    /**
     * Accepts an array of doubles and converts it to a string.
     * @param toPrint array to convert
     * @return the converted string
     */
    public static String ArrayToString(double[] toPrint) {

        String pretty = "[";
        for (int i = 0; i < toPrint.length - 1; i++) {
            pretty += toPrint[i] + ", ";
        }
        pretty += toPrint[toPrint.length - 1] + "]";

        return pretty;
    }



    /**
     * Accepts an array of booleans and converts it to a string.
     * @param toPrint array to convert
     * @return the converted string
     */
    public static String ArrayToString(boolean[] toPrint) {

        String pretty = "[";
        for (int i = 0; i < toPrint.length - 1; i++) {
            pretty += toPrint[i] + ", ";
        }
        pretty += toPrint[toPrint.length - 1] + "]";

        return pretty;
    }


    /**
     * Accepts an array and a new size and returns the array of the new size. If the new size is
     * smaller than the old size, the values are truncated
     * @param array array to modify
     * @param newsize size of the array to return
     * @return the new array
     */
    public static int[] ArrayChangeSize(int[] array, int newsize){
        int[] newArray = new int[newsize];

        for (int i = 0; i < array.length && i < newsize; i++) {
           newArray[i] = array[i];
        }
        return newArray;
    }

    /**
     * Accepts an array and a new size and returns the array of the new size. If the new size is
     * smaller than the old size, the values are truncated
     * @param array array to modify
     * @param newsize size of the array to return
     * @return the new array
     */
    public static Object[] ArrayChangeSize(Object[] array, int newsize){
        Object[] newArray = new Object[newsize];

        for (int i = 0; i < array.length && i < newsize; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }


    /**
     * Accepts an array and a new size and returns the array of the new size. If the new size is
     * smaller than the old size, the values are truncated
     * @param array array to modify
     * @param newsize size of the array to return
     * @return the new array
     */
    public static double[] ArrayChangeSize(double[] array, int newsize){
        double[] newArray = new double[newsize];

        for (int i = 0; i < array.length && i < newsize; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }



    /**
     * Accepts an array and a new size and returns the array of the new size. If the new size is
     * smaller than the old size, the values are truncated
     * @param array array to modify
     * @param newsize size of the array to return
     * @return the new array
     */
    public static boolean[] ArrayChangeSize(boolean[] array, int newsize){
        boolean[] newArray = new boolean[newsize];

        for (int i = 0; i < array.length && i < newsize; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    /**
     * Accepts an array and a new size and returns the array of the new size. If the new size is
     * smaller than the old size, the values are truncated
     * @param array array to modify
     * @param newsize size of the array to return
     * @return the new array
     */
    public static char[] ArrayChangeSize(char[] array, int newsize){
        char[] newArray = new char[newsize];

        for (int i = 0; i < array.length && i < newsize; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }
}
