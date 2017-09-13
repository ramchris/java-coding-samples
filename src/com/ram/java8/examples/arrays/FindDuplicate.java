package com.ram.java8.examples.arrays;

import java.util.HashSet;
import java.util.Set;

class FindDuplicate
{
    void printRepeating(int arr[], int size)
    {
        int i;
        System.out.println("The repeating elements are : ");
        Set duplicates = new HashSet();
        for (int j=0;j<arr.length;j++)
            for (int k=j+1;k<arr.length;k++)
                if (k!=j && arr[k] == arr[j]) {
                    System.out.println("Duplicate found "+arr[j]);
                    duplicates.add(arr[j]);
                }
        duplicates.stream().forEach(h->System.out.println(h));
    }

    /* Driver program to test the above function */
    public static void main(String[] args)
    {
        FindDuplicate duplicate = new FindDuplicate();
        int arr[] = {4, 2, -1, 4, 5, 2, 3, -1};
        int arr_size = arr.length;
        duplicate.printRepeating(arr, arr_size);
    }
}
