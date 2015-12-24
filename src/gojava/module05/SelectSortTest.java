package gojava.module05;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SelectSortTest {

    @Test
    public void ShouldSortArrayAscent() throws Exception {
        SelectSort mySelectSort = new SelectSort();
        int[] arrayOfIntegers = {-23, 45, -99, 52, 0, 36, 41, 14, -425, 85, 41, 23, 7758, 54, 1};
        int[] expected = Arrays.copyOf(arrayOfIntegers, arrayOfIntegers.length);
        Arrays.sort(expected);
        Assert.assertArrayEquals("failure - arrays not same", expected, mySelectSort.sortAscent(
                arrayOfIntegers));
    }

    @Test
    public void ShouldSortArrayDescent() throws Exception {
        SelectSort mySelectSort = new SelectSort();
    }
}