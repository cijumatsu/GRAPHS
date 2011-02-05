/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package CLASSES;

/**
 *
 * @author cijumatsu
 */
public class Recursion {

    public int factorial(int number){
        int initial_number = number;
        int result=0;

        if(number == 1){
            
            return 1;
        } else {
            //System.out.println("number : " + number);
            result = number * factorial(number-1);
            System.out.println("number : " + number + "  result : " + result);


            return result;
        }

    }

    public static int power(int base, int exponent){
        if(exponent == 0){
            return 1;
        } else {

            int subresult = power(base, exponent-1);
            System.out.println("base : " + base + " exponent : " + exponent + " subresult : " + subresult);

            return base*subresult;

         
         
        }

    }

}
