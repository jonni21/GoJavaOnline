package gojava.module05;

import java.util.Arrays;

public class MaxMinFinder {

    public int findMax(int[] inputArray) {
        int max = inputArray[0];
        for (int element : inputArray) {
            if (max < element) {
                max = element;
            }
        }
        return max;
    }

    public int findMin(int[] inputArray) {
        int min = inputArray[0];
        for (int element : inputArray) {
            if (min > element) {
                min = element;
            }
        }
        return min;
    }
}
