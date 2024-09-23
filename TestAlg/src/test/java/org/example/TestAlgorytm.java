package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAlgorytm {
    @Test
    public void testSortandFind() {
        int[] arr = new int[] {120, 11, 130, 50, 16, 77};
        ArrayUtils arrayUtil = new ArrayUtils();
        arrayUtil.mergeSort(arr);
        // check if first value in array becomes 11 after sorting
        assertEquals(11, arr[0]);
        assertEquals(130, arr[arr.length - 1]);
        int target = 77;
        int index = ArrayUtils.binarySearch(arr, target);
        // check if index of 77 is 3
        assertEquals(3, index);
        target = 770;
        index = ArrayUtils.binarySearch(arr, target);
        // check if index of 770 is -1
        assertEquals(-1, index);

    }
}
