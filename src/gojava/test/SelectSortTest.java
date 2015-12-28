package gojava.test;

import gojava.module05.SelectSort;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SelectSortTest {

    @Test
    public void shouldSortArrayAscent() throws Exception {
        SelectSort mySelectSort = new SelectSort();
        int[] arrayOfIntegers = {-23, 45, -99, 52, 0, 36, 41, 14, -425, 85, 41, 23, 7758, 54, 1};
        int[] expected = Arrays.copyOf(arrayOfIntegers, arrayOfIntegers.length);
        Arrays.sort(expected);
        Assert.assertArrayEquals("failure - arrays are not same", expected,
                                 mySelectSort.sortAscent(arrayOfIntegers));
    }

    @Test
    public void shouldSortArrayDescent() throws Exception {
        SelectSort mySelectSort = new SelectSort();
        int[] arrayOfIntegers = {1, 2, 2, 3, 4, 9, 5, 4, 6, 7, 8, 0};
        int[] expected = {9, 8, 7, 6, 5, 4, 4, 3, 2, 2, 1, 0};
        Assert.assertArrayEquals("failure - arrays are not equal", expected,
                                 mySelectSort.sortDescent(arrayOfIntegers));
    }
}