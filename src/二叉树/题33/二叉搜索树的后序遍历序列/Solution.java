package 二叉树.题33.二叉搜索树的后序遍历序列;

/**
 * @ClassName Solution
 * @Author huangyiming@sensetime.com
 * @Date 2020/3/17 16:18
 * @Description Solution
 */

// 例如输入数组{5， 7， 6， 9， 11， 10， 8}，则返回true，
// 因为这个整数序列是上图二叉搜索树的后序遍历结果。
// 如果输入的数组是{7， 4， 6， 5}，
// 由于没有哪颗二叉搜索树的后序遍历的结果是这个序列，
// 因此返回false。
// 后续
public class Solution {

    // 传入一个数组判断是否是二叉搜索树后续遍历
    public boolean verifySquenceOfBST(int sequence[]) {
        if (sequence == null) {
            return false;
        }
        return verify(sequence, 0, sequence.length - 1);
    }

    // 校验方法
    private boolean verify(int[] sequence, int first, int last) {

        if (last - first <= 1) {
            return true;
        }
        // 后序遍历的最后一个结点为根结点
        int rootVal = sequence[last];
        // 数组第一个数的下标
        int cutIndex = first;

        // 判断根节点的左子树
        // 得出的cutIndex为根节点的左子树下标
        while (cutIndex < last && sequence[cutIndex] <= rootVal) {
            cutIndex++;
        }

        // 判断根节点右子树中的值，如果小于根子树，直接返回false
        for (int i = cutIndex; i < last; i++){
            if (sequence[i] < rootVal){
                return false;
            }
        }

        // 对当前节点的左子树和右子树分别进行后序遍历校验
        return verify(sequence, first, cutIndex - 1) && verify(sequence, cutIndex, last - 1);
    }

}
