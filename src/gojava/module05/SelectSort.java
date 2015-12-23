package gojava.module05;

public class SelectSort {

    public static final void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public int[] sortAscent(int[] inputArray) {
        int currentIndex = 0;
        int minIndex = 0;
        boolean isNewMinFound = false;

        while (currentIndex < inputArray.length - 1) {
            int min = inputArray[currentIndex];
            for (int i = currentIndex + 1; i < inputArray.length; i++) {
                if (min > inputArray[i]) {
                    min = inputArray[i];
                    minIndex = i;
                    isNewMinFound = true;
                }
            }
            if (isNewMinFound) {
                swap(inputArray, currentIndex, minIndex);
                isNewMinFound = false;
            }
            currentIndex++;
        }
        return inputArray;
    }

    public int[] sortDescent(int[] inputArray) {
        int currentIndex = 0;
        int maxIndex = 0;
        boolean isNewMaxFound = false;

        while (currentIndex < inputArray.length - 1) {
            int max = inputArray[currentIndex];
            for (int i = currentIndex + 1; i < inputArray.length; i++) {
                if (max < inputArray[i]) {
                    max = inputArray[i];
                    maxIndex = i;
                    isNewMaxFound = true;
                }
            }
            if (isNewMaxFound) {
                swap(inputArray, currentIndex, maxIndex);
                isNewMaxFound = false;
            }
            currentIndex++;
        }
        return inputArray;
    }
}
