class Solution {
    public int reverse(int x) {
        long result = 0; // 使用 long 避免 int 溢出

        while (x != 0) {
            int digit = x % 10;
            result = result * 10 + digit;
            x /= 10;
        }

        // 检查是否超出 int 范围 [-2^31, 2^31-1]
        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) result;
    }
}