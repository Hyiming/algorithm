package 二叉树.题34.二叉树中和为某一值的路径;

import 二叉树.TreeNode;

import java.util.ArrayList;

/**
 * @ClassName Solution
 * @Author huangyiming@sensetime.com
 * @Date 2020/3/17 17:37
 * @Description Solution
 */
public class Solution {
    private ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        backtracking(root, target, new ArrayList<>());
        return ret;
    }

    private void backtracking(TreeNode root, int target, ArrayList<Integer> path) {
        if (null == root) {
            return;
        }
        path.add(root.val);
        target -= root.val;
        if (target == 0 && root.left == null && root.right == null) {
            ret.add(new ArrayList<Integer>(path));
        } else {
            backtracking(root.left, target, path);
            backtracking(root.right, target, path);
        }
        path.remove(path.size()-1);
    }
}
