package 二叉树.题33.二叉搜索树的后序遍历序列;

/**
 * @ClassName Solution2
 * @Author huangyiming@sensetime.com
 * @Date 2020/3/17 16:50
 * @Description 练习
 */
public class Solution2 {
    public boolean verityBST(int[] sequence) {
        if (null == sequence) {
            return false;
        }
        return verity(sequence, 0, sequence.length-1);
    }
    private boolean verity(int[] sequence,int first,int last) {
        if (last - first <= 0) {
            return true;
        }

        int root = sequence[last];
        int index = first;

        while (index < last && sequence[index] < root) {
            index++;
        }

        for (int i = index; i < last; i++) {
            if (sequence[i] < root) {
                return false;
            }
        }

        return verity(sequence,first,index-1) && verity(sequence,index+1,last);
    }
}
