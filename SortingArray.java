
// TASK_01

import java.util.Arrays;
import java.util.Scanner;

public class SortingArray {
    void BubbleSort(){
        System.out.println("Elements before sorting ");
        int arr[]={180,165,150,170,145};
        System.out.println(Arrays.toString(arr));
        System.out.println();
        long a1=System.nanoTime();
        System.out.println("Time Execution "+a1);
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Now Swap it
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Elements after sorting ");
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i]+" " );
        }
    }

    void SelectionSort(){
        System.out.println("Elements before selection Sort");
        int arr[]={180,165,150,170,145};
        System.out.println(Arrays.toString(arr));
        System.out.println();
        long a2=System.nanoTime();
        System.out.println("Time Execution "+a2);
        for(int i=0;i<arr.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<arr.length;j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        System.out.println("After Selection Sort ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    void InsertionSort(){
        System.out.println("Elements before InsertionSort ");
        int arr[] = {180,165,150,170,145};
        System.out.println(Arrays.toString(arr)+" ");
        System.out.println();
        long a3=System.nanoTime();
        System.out.println("Time Execution "+a3);
        //insertion sort
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                //Keep swapping
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        System.out.println("Elements After InsertionSort ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
// Quick Sort:

    public static int partition(int arr[],int low,int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;//pivot index
    }
    public static void quickSort(int arr[],int low,int high){
        if(low<high){
            int pidx=partition(arr,low,high);
            quickSort(arr, low, pidx-1);
            quickSort(arr,pidx+1,high);
        }


    }


    public static void main(String[] args) {
        SortingArray s1=new SortingArray();
        s1.BubbleSort();

        s1.SelectionSort();
        s1.InsertionSort();
        System.out.println("Quick Sort");
        int arr[] = {180,165,150,170,145};
        System.out.println("Before Quick Sort "+Arrays.toString(arr));
        System.out.println();
        int n=arr.length;

        quickSort(arr,0,n-1);
        System.out.println("After Quick Sort");
        long a4=System.nanoTime();
        System.out.println("Time Execution "+a4);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();

    }
}




