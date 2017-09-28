/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesort;

import java.util.Arrays;

/**
 *
 * @author H
 */
public class MergeSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int a[] = { 51, 46, 20, 18, 65, 97, 82, 30, 77, 50 };
        System.out.println("初始值");
        System.out.println(Arrays.toString(a));
        System.out.println("排序后");
        mergeSort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
    
    public static void mergeSort(int[] a,int low,int high) {
        int middle = (low+high)/2;
        if(low<high) {
            mergeSort(a,low,middle);
            mergeSort(a,middle+1,high);
            merge(a,low,middle,high);
        }
    }
    
    public static void merge(int[] arr, int low,int mid,int high) {
        int[] temp = new int[high - low +1];
        int i = low;
        int j = mid+1;
        int k = 0;
         // 把较小的数先移到新数组中
        while(i<=mid && j<=high) {
            if(arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            }else {
                temp[k++] = arr[j++];
            }
        }      
         // 把左边剩余的数移入数组
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
         // 把右边边剩余的数移入数组
        while (j <= high) {
            temp[k++] = arr[j++];
        }
        // 把新数组中的数覆盖nums数组
        for (int k2 = 0; k2 < temp.length; k2++) {
            arr[k2 + low] = temp[k2];
        }
    }
}
