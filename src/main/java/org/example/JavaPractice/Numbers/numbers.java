package org.example.JavaPractice.Numbers;

import java.util.LinkedHashSet;
import java.util.Set;

public class numbers {

    public static void main(String[] args) {
        int[] array = {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};

        System.out.println("Original array:");
        printArray(array);
        moveZerosToFront(array);
        System.out.println("Array after moving zeros to the front:");
        printArray(array);

        /////////////////////////////////
        int[] arr2=removeDuplicates(array);
        System.out.println("Array after removing duplicate numbers ");
        printArray(arr2);
    }

    public static int[] removeDuplicates(int[] array) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int value : array) {
            set.add(value);
        }

        int[] result = new int[set.size()];
        int index = 0;
        for (int value : set) {
            result[index++] = value;
        }

        return result;
    }

    public static void moveZerosToFront(int[] array) {
        int count = array.length - 1;

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] != 0) {
                array[count--] = array[i];
            }
        }

        while (count >= 0) {
            array[count--] = 0;
        }
    }

    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
