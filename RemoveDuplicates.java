/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package removeduplicates;

import java.util.Scanner;

/**
 *
 * @author 14942
 */
public class RemoveDuplicates {

    /**
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Input an Array
        
        //Input Aray Length
        System.out.println("Array Length:");
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        
        //Input Array Entities
        System.out.println("Array Entities:");
        int arr[] = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i]=in.nextInt();
        }
        System.out.println(RemoveDuplicates(arr));
    }
    
    //Create Method
    public static int RemoveDuplicates (int[] arr) {
        int j=0;
        
        //Find number of Duplicates
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]==arr[i+1]) {
                j++;
            }
        }
        
        //Create a new Array
        int[] newArray = new int[arr.length-j];
        for (int i = 0, k=0; i < arr.length-1; i++) {
            if (arr[i]!=arr[i+1]) {
                newArray[k]=arr[i]; k++;
            }
        }
        
        //The final value of first array willbe the same as that of second array
        newArray[newArray.length-1]=arr[arr.length-1];
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
        return newArray.length;
    }

}
