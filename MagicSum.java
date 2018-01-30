/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MagicSum;

import java.util.Scanner;

/**
 *
 * @author 14779
 */
public class MagicSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declare input object
        Scanner in = new Scanner(System.in);
        
        //Total Numbers
        System.out.println("Total Numbers:");
        int length = in.nextInt();
        int[] arr = new int[length];
        for (int i=0; i<arr.length; i++) {
            System.out.println("Input:");
            arr[i]=in.nextInt();
        }
        
        //Call the Sum Eight Method
        System.out.println(sumEights(arr));
    }
    
    //Sum Eights Method
    public static int sumEights (int[] arr) {
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if (hasEight(arr[i]))
            sum+=arr[i];
        }
        return sum;
    }
    
    //hasEight Method
    public static boolean hasEight(int input) {
        
        //Logic: Convert to String first
        String in = "" + input;
        String[] arr = in.split("");
        for (int i = 1; i < arr.length; i++) {
            if (Integer.parseInt(arr[i])==8) {
                return true;
            }
        }
        return false;
    }
    
}
