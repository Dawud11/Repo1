/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HasEight;

import java.util.Scanner;

/**
 *
 * @author 14779
 */
public class HasEight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        System.out.println("Input:");
        System.out.println(hasEight(num));
    }
    public static boolean hasEight(int input) {
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
