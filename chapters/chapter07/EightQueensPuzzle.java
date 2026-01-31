// 递归调用应用实例-八皇后问题
// 八皇后思路分析，老韩说下
// 1）第一个皇后先放第一行第一列
// 2）第二个皇后放在第二行第一列、然后判断是否OK，如果不OK，
// 继续放在第二列、第三列、依次把所有列都放完，找到一个合适3）
// 继续第三个皇后，还是第一列、第二列....直到第8个皇后也能放
// 在一个不冲突的位置，算是找到了一个正确解
// 4）当得到一个正确解时，在栈回退到上一个栈时，就会开始回溯，即将第一个皇后，
// 放到第一列的所有正确解，全部得到。
// 5）然后回头继续第一个皇后放第二列，后面继续循环执行1，2，3，4的步骤【示意图】
// 说明：理论上应该创建一个二维数组来表示棋盘，
// 但是实际上可以通过算法，
// 用一个一维数组即可解决问题.arr[8]={0，4,7，5，2，6,13}
// //对应arr 下标表示第几行，即第几个皇后，
// arr[i]=val，val表示第i+1个皇后，放在第i+1行的第val+1列

public class EightQueensPuzzle{
    // 定义一个max表示共有多少个皇后
    int max = 8;
    // 定义数组 array, 保存皇后放置位置的结果
    int[] array = new int[max];
    // 统计解法的数量
    static int count = 0;

    public static void main(String[] args) {
        EightQueens queen = new EightQueens();
        // 从第1个皇后开始放（下标是0）
        queen.check(0);
        System.out.printf("一共有 %d 种解法", count);
    }

    // 核心方法：编写一个方法，放置第 n 个皇后
    // check 是每一次递归时，进入到下一行，并在该行尝试每一列
    private void check(int n) {
        // 1. 递归出口（终点）
        // 如果 n == max，说明 0~7 行都已经放好了，正在试图放第 9 个（下标8）
        // 这时候说明已经找到了一种解法
        if (n == max) {
            print(); // 打印结果
            return;
        }

        // 2. 依次放入皇后，并判断是否冲突
        for (int i = 0; i < max; i++) {
            // 先把当前这个皇后 n，放到该行的第 i 列
            array[n] = i;

            // 判断当放置第 n 个皇后到 i 列时，是否冲突
            if (judge(n)) { 
                // 如果不冲突，接着放 n+1 个皇后 (这就是递归！)
                check(n + 1); 
            }
            // 如果冲突，for循环继续执行 i++
            // 这就是回溯的核心！array[n] 会被赋予新的 i 值
            // (如果 i 走到 max 也没找到位置，这个方法结束，回退到上一层栈)
        }
    }

    // 裁判方法：查看当我们放置第 n 个皇后，就去检测该皇后是否和前面已经摆放的皇后冲突
    /**
     * @param n 表示第 n 个皇后
     * @return true:不冲突 false:冲突
     */
    private boolean judge(int n) {
        for (int i = 0; i < n; i++) {
            // 说明：
            // 1. array[i] == array[n] 表示判断第 n 个皇后是否和前面的皇后在同一列
            // 2. Math.abs(n - i) == Math.abs(array[n] - array[i]) 表示判断是否在同一斜线
            //    原理：行之差的绝对值 == 列之差的绝对值 (等腰直角三角形原理)
            // 3. 这里的 n 和 i 是行，本来就不一样，所以不用判断是否在同一行
            if (array[i] == array[n] || Math.abs(n - i) == Math.abs(array[n] - array[i])) {
                return false;
            }
        }
        return true;
    }

    // 打印当前解法
    private void print() {
        count++;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}