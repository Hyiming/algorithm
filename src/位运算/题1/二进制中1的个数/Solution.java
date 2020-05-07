package 位运算.题1.二进制中1的个数;

/**
 * @ClassName Solution
 * @Author huangyiming@sensetime.com
 * @Date 2020/3/31 23:46
 * @Description Solution
 */

// 题目：输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。

/**
 *  通常的剑指offer的思路，n&(n-1) 操作相当于把二进制表示中最右边的1变成0。
 *  所以只需要看看进行了多少次这样的操作即可。看看什么时候n为0.
 */
public class Solution {
    public int NumberOf1(int n) {
        int count = 0;
        while(n!= 0){
            count++;
            n = n & (n - 1);
        }
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.NumberOf1(10);
        System.out.println(i);
    }
}
