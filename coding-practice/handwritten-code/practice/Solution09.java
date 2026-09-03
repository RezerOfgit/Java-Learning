class Solution {
    public boolean isPalindrome(int x) {
        // 负数不是回文数
        if (x < 0) return false;
        // 个位数是回文数
        if (x < 10) return true;
        // 末尾为0但x不是0，则不是回文数（如10, 100）
        if (x % 10 == 0) return false;

        int reversed = 0;
        // 反转一半数字，避免全部反转溢出
        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        // 当数字长度为奇数时，reversed会比x多一位，可以去掉中间位比较
        return x == reversed || x == reversed / 10;
    }
}