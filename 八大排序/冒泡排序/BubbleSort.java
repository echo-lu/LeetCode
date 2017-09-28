/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

import java.util.Arrays;

/**
 *
 * @author H
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[] = { 51, 46, 20, 18, 65, 97, 82, 30, 77, 50 };
        System.out.println("初始值");
        System.out.println(Arrays.toString(a));
        System.out.println("排序后");
        bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void bubbleSort(int arr[]) {
        int temp;
        for(int i=0;i<arr.length-1;i++) {
            for(int j=arr.length-1;j>i;j--) {
                if(arr[j]<arr[j-1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
}
