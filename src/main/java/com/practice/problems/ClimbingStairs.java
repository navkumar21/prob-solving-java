package com.practice.problems;

/*
 There are n stairs, a person standing at the bottom wants to reach the top.
 The person can climb either 1 stair or 2 stairs at a time. Count the number of ways, the person can reach the top.
 */
public class ClimbingStairs {

    public int climbStairs(int numOfStairs) {

        if(numOfStairs < 1){
            return 0;
        }
        if(numOfStairs < 2){
            return 1;
        }

        int numberOfWays[] = new int[numOfStairs+1];
        numberOfWays[0] = 0;
        numberOfWays[1] = 1;
        numberOfWays[2] = 2;

        for(int i=3; i<=numOfStairs; i++){
            numberOfWays[i] = numberOfWays[i-1] + numberOfWays[i-2];
        }
        return numberOfWays[numOfStairs];
    }
}
