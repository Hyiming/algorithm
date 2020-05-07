package 二叉树.题34.二叉树中和为某一值的路径;

import 二叉树.TreeNode;

import java.util.ArrayList;

/**
 * @ClassName 二叉树中和为某一值的路径
 * @Author huangyiming@sensetime.com
 * @Date 2020/3/17 17:17
 * @Description 二叉树中和为某一值的路径
 */
public class 二叉树中和为某一值的路径 {
    private ArrayList<ArrayList<Integer>> ret = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        backtracking(root, target, new ArrayList<>());
        return ret;
    }

    private void backtracking(TreeNode node, int target, ArrayList<Integer> path) {
        if (node == null) {
            return;
        }

        // 将根节点放入路径中
        path.add(node.val);

        // target 为剩下的值
        target -= node.val;

        // 满足条件返回当前的数组path
        if (target == 0 && node.left == null && node.right == null) {
            ret.add(new ArrayList<>(path));
        } else {
            backtracking(node.left, target, path);
            backtracking(node.right, target, path);
        }

        // 当遍历到当前节点无子节点时
        // path减去当前节点的值
        path.remove(path.size() - 1);
    }
}
