package gojava.test;

import gojava.module05.MaxMinFinder;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxMinFinderTest {

    @Test
    public void testFindMax() throws Exception {
        MaxMinFinder myMaxMinFinder = new MaxMinFinder();
        int[] arrayOfIntegers = {4, 5, -98, 456, 0, -1, 45, -9885541, 1236654};
        Assert.assertEquals(1236654, myMaxMinFinder.findMax(arrayOfIntegers));
    }

    @Test
    public void testFindMin() throws Exception {
        MaxMinFinder myMaxMinFinder = new MaxMinFinder();
        int[] arrayOfIntegers = {4, 5, -98, 456, 0, -1, 45, -9885541, 1236654};
        Assert.assertEquals(-9885541, myMaxMinFinder.findMin(arrayOfIntegers));
    }
}