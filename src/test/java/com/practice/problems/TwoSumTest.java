package com.practice.problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TwoSumTest{

    @Test
    public void testFindNumbersSuccessfull() throws Exception {
        TwoSum twoSum = new TwoSum();
        int[] input = {2, 7, 11, 15};
        int target = 9;
        int [] results = twoSum.findNumbers(input, target);
        assertEquals(0, results[0]);
        assertEquals(1, results[1]);
    }

    @Test
    public void testFindNumbersUnSuccessfull() throws Exception {
        TwoSum twoSum = new TwoSum();
        int[] input = {2, 7, 11, 15};
        int target = 10;
        int [] results = twoSum.findNumbers(input, target);
        assertEquals(0, results[0]);
        assertEquals(0, results[1]);
    }
}