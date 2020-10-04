package problems;

import java.util.Arrays;

public class ClimbingStairs0070 {
    class Solution {

        private int[] possibilities;

        public int climbStairs(int n) {

            possibilities = new int[n + 1];
            Arrays.fill(possibilities, -1);
            possibilities[0] = 1;

            return calculate(n);
        }

        private int calculate(int n) {

            if (n < 0)
                return 0;

            if (possibilities[n] >= 0)
                return possibilities[n];

            possibilities[n] = calculate(n - 1) + calculate(n - 2);
            return possibilities[n];
        }
    }
}
