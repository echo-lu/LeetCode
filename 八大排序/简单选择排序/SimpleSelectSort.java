/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleselectsort;

/**
 *
 * @author H
 */
public class SimpleSelectSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[] = {3,4,9,7,4,55,6,32,2,1,53,21};
        SimpleSelectSort insert = new SimpleSelectSort();
        System.out.println("初始值");
        insert.print(a);
        System.out.println("排序后");
        insert.selectSort(a);
        insert.print(a);
         
    }
    public void print(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public void selectSort(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            int k=i;
            for(int j=i+1;j<arr.length;j++) {
                if(arr[k]>arr[j]) {
                    k = j;
                }
            }
            swap(arr,k,i);
        }
    }
    public void swap(int[] data,int i,int j) {
        if(i == j) {
            return;
        }
        data[i] = data[i] + data[j];
        data[j] = data[i] - data[j];
        data[i] = data[i] - data[j];
    }
    
}
