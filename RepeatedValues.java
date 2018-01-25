/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author 14942
 */
public class RepeatedValues {

    /**
     * @param args the command line arguments
     */
    
    //
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Take Input
        System.out.println("Array Length:");
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        System.out.println("Array Entities:");
        int arr[] = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i]=in.nextInt();
        }
        System.out.println(run(arr));
    }
    
    //Make a method to find the repeated values
    public static int run (int[] arr) {
        int k=1;
        for (int i=0, j=1; i<arr.length-1; i++) {
            if (arr[i]==arr[i+1]) {
                j++;
            }
            if (j>k) {
                k=j;
            }
            if (arr[i]!=arr[i+1]) {
                j=0;
            }
        }
        return k;
    }
    
}
