package com.ram.java8.examples.algos;

public class QuickSortImplementation {

    public static void QuickSort(int[] arr, int left, int right)
    {
        int index = partition(arr,left,right);
        if(left <index-1)
            QuickSort(arr, left, index-1);
        if(index < right)
            QuickSort(arr, index, right);
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[(left+right) /2];
        //System.out.println(pivot);
        while(left <= right) {
            while (arr[left] <pivot) left++;
            while (arr[right] > pivot) right--;

            if(left <= right) {
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right]= tmp;
                left++;
                right--;
            }
        }
        return  left;
    }

    public static void main(String[] args) {
        int[] integers = new int[] {10,9,8,7,4,5,6,3,2,1};

        QuickSort(integers, 0, integers.length -1);

        for(int i =0;i<integers.length;i++)
            System.out.println(integers[i]);
    }
}
