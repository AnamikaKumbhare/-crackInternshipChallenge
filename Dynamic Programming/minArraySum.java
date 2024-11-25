import java.util.Arrays;

class Solution {
    public int minArraySum(int[] nums, int k, int op1, int op2) {
        int[][][] dp = new int[nums.length][op1 + 1][op2 + 1];
        for (int[][] arr : dp) {
            for (int[] subArr : arr) {
                Arrays.fill(subArr, -1);
            }
        }

        return solve(nums, k, 0, op1, op2, dp);
    }

    public int solve(int[] nums, int k, int idx, int op1, int op2, int[][][] dp) {
        if (idx == nums.length) {
            return 0;
        }

        if (dp[idx][op1][op2] != -1) {
            return dp[idx][op1][op2]; 
        }

        int ans = Integer.MAX_VALUE;
        int sumNoop = nums[idx] + solve(nums, k, idx + 1, op1, op2, dp);
        ans = Math.min(ans, sumNoop);
        if (op1 > 0) {
            int sumOp1 = ((int) Math.ceil(nums[idx] / 2.0)) + solve(nums, k, idx + 1, op1 - 1, op2, dp);
            ans = Math.min(ans, sumOp1);
        }
        if (op2 > 0 && nums[idx] >= k) {
            int sumOp2 = (nums[idx] - k) + solve(nums, k, idx + 1, op1, op2 - 1, dp);
            ans = Math.min(ans, sumOp2);
        }
        if (op1 > 0 && op2 > 0) {
            int afterOp1 = (int) Math.ceil(nums[idx] / 2.0);
            if (afterOp1 >= k) {
                int sumOp1Op2 = (afterOp1 - k) + solve(nums, k, idx + 1, op1 - 1, op2 - 1, dp);
                ans = Math.min(ans, sumOp1Op2);
            }
            if (nums[idx] >= k) {
                int sumOp2Op1 = (int) Math.ceil((nums[idx] - k) / 2.0) + solve(nums, k, idx + 1, op1 - 1, op2 - 1, dp);
                ans = Math.min(ans, sumOp2Op1);
            }
        }

        dp[idx][op1][op2] = ans; 
        return ans;
    }
}

