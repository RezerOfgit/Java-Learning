class Solution {
    public int divide(int dividend, int divisor) {
        // 唯一的溢出情况：Integer.MIN_VALUE / -1
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // 判断结果符号（异或为负）
        boolean negative = (dividend ^ divisor) < 0;

        // 转 long 避免 abs(MIN_VALUE) 溢出
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        int result = 0;

        // 倍增法：从高位到低位，找 a 中能容纳多少个 b * 2^i
        for (int i = 31; i >= 0; i--) {
            if ((a >> i) >= b) {
                result += 1 << i;
                a -= b << i;
            }
        }

        return negative ? -result : result;
    }
}