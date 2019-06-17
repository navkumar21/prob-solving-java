package com.practice.problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution.
 * <p>
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */

public class TwoSum {

    public int[] findNumbers(int[] nums, int total){
        Map<Integer,Integer> visitedNumIndex = new HashMap<>();
        int results[] = new int[2];
        for(int i=0; i<nums.length; i++){
            int remaining = total - nums[i];
            if(visitedNumIndex.containsKey(remaining)){
                results[0] = visitedNumIndex.get(remaining);
                results[1] = i;
                return results;
            }else {
                visitedNumIndex.put(nums[i], i);
            }
        }
        return results;
    }
}
