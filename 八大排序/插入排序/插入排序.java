/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertsort;

/**
 *
 * @author H
 */
public class InsertSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[] = {3,4,9,7,4,55,6,32,2,1,53,21};
        InsertSort insert = new InsertSort();
        System.out.println("初始值");
        insert.print(a);
        System.out.println("排序后");
        insert.insertSort(a);
        insert.print(a);
         
    }
    public void print(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public void insertSort(int[] arr) {
        for(int i=1;i<arr.length;i++) {
            if(arr[i] < arr[i-1]) {
                int j;
                int x = arr[i];
                arr[i] = arr[i-1];
                for(j=i-1; j>=0 && x<arr[j];j--) {
                    arr[j+1] = arr[j];
                }
                arr[j+1] = x;
            }
        }
    }
    
    
    
}
