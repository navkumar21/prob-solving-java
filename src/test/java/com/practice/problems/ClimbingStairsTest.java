package com.practice.problems;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;


public class ClimbingStairsTest {

    private Map<Integer,Integer> climbingStairWays = new HashMap<Integer, Integer>() {{
        put(0,0);
        put(1,1);
        put(2,2);
        put(3,3);
        put(4,5);
        put(5,8);
    }};

    @Test
    public void test() throws Exception {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        climbingStairWays.forEach((numOfStairs, numOfWays) -> {
            assertEquals("numOfStairs : "+ numOfStairs ,numOfWays.intValue() ,climbingStairs.climbStairs(numOfStairs));
        });
    }

    //1111, 112, 22, 121, 211

}