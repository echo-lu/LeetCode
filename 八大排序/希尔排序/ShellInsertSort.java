/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shellinsertsort;

/**
 *
 * @author H
 */
public class ShellInsertSort {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // TODO code application logic here
        int a[] = {3,4,9,7,4,55,6,32,2,1,53,21};
        ShellInsertSort insert = new ShellInsertSort();
        System.out.println("初始值");
        insert.print(a);
        System.out.println("排序后");
        insert.shellSort(a);
        insert.print(a);
         
    }
    public void print(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public void shellSort(int[] arr) {
        int dk = arr.length / 2;
        while(dk>=1) {
            ShellInsertSort(arr,dk);
            dk = dk/2;
        }
    }
    public void ShellInsertSort(int[] arr,int dk) {
        for(int i=dk;i<arr.length;i++) {
            if(arr[i] < arr[i-dk]) {
                int j;
                int x = arr[i];
                arr[i] = arr[i-dk];
                for(j=i-dk; j>=0 && x<arr[j];j=j-dk) {
                    arr[j+dk] = arr[j];
                }
                arr[j+dk] = x;
            }
        }
    }
    
}
