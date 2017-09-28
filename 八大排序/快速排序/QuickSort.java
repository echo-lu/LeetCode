/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

import java.util.Arrays;

/**
 *
 * @author H
 */
public class QuickSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[] = { 51, 46, 20, 18, 65, 97, 82, 30, 77, 50 };
        System.out.println("初始值");
        System.out.println(Arrays.toString(a));
        System.out.println("排序后");
        quickSort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
    public static void quickSort(int[] arr,int low,int high) {
        if(low<high) {
            int middle = getMiddle(arr,low,high);
            quickSort(arr,0,middle-1);
            quickSort(arr,middle+1,high);
        }
    }
    
    public static int getMiddle(int[] arr,int low,int high) {
        int key = arr[low];
        while(low<high) {
            while(low<high && arr[high] >= key) high--;
            arr[low] = arr[high];
            while(low<high && arr[low] <= key) low++;
            arr[high] = arr[low];
        }
        arr[low] = key;
        return low;
    }
}
