import java.util.Arrays;
class Solution {
    int mod = (int) 1e9 + 7;
    long[] fact;
    long[] inv;

    public long nCr(int n, int size, long[] fact, long[] inv) {
        if (size > n || size < 0) return 0;
        return (fact[n] * inv[size] % mod * inv[n - size] % mod) % mod;
    }

    long power(long x, long y, int mod) {
        long res = 1;
        while (y > 0) {
            if (y % 2 == 1) res = res * x % mod;
            x = x * x % mod;
            y >>= 1;
        }
        return res;
    }

    public void computefact(long[] fact, long[] inv, int n) {
        fact[0] = inv[0] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = fact[i - 1] * i % mod;
        }
        inv[n] = power(fact[n], mod - 2, mod);
        for (int i = n - 1; i >= 1; i--) {
            inv[i] = (inv[i + 1] * (i + 1)) % mod;
        }
    }

    public int minMaxSums(int[] nums, int k) {
        int result = 0;
        Arrays.sort(nums);
        fact = new long[nums.length + 1];
        inv = new long[nums.length + 1];
        computefact(fact, inv, nums.length);
        for (int i = 0; i < nums.length; i++) {
            for (int size = 1; size <= k; size++) {
                long l1 = nums[i] * nCr(nums.length - (i + 1), size - 1, fact, inv) % mod;
                long l2 = nums[i] * nCr(i, size - 1, fact, inv) % mod;
                result = (int) ((result + l1 + l2) % mod);
            }
        }
        return result;
    }
}