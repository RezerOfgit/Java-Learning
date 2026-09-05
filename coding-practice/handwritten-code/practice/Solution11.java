class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            // 当前容器的宽度
            int width = right - left;
            // 高度由较短的边决定
            int h = Math.min(height[left], height[right]);
            // 更新最大面积
            maxArea = Math.max(maxArea, width * h);

            // 移动较短的边，以寻求更大的面积
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}