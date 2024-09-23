package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{12, 11, 13, 5, 6, 7};
        System.out.println("Вхідний масив: " + Arrays.toString(arr));
        ArrayUtils arrayUtil = new ArrayUtils();
        arrayUtil.mergeSort(arr);
        System.out.println("Відсортований масив: " + Arrays.toString(arr));
        int target = 13;
        int index = ArrayUtils.binarySearch(arr, target);
        if (index != -1) {
            System.out.println("Елемент " + target + " знайдено за індексом " + index);
        } else {
            System.out.println("Елемент  не знайдено у масиві");
        }
    }
}