package 二叉树.题37.序列化二叉树;

/**
 * @ClassName 序列化二叉树
 * @Author huangyiming@sensetime.com
 * @Date 2020/3/20 23:57
 * @Description 序列化二叉树
 */

import 二叉树.TreeNode;

/**
 *
    二叉树的序列化是指：把一棵二叉树按照某种遍历方式的结果以某种格式保存为字符串，
    从而使得内存中建立起来的二叉树可以持久保存。序列化可以基于先序、中序、后序、层序的二叉树遍历方式来进行修改，
    序列化的结果是一个字符串，序列化时通过 某种符号表示空节点（#），以 ！ 表示一个结点值的结束（value!）。
    二叉树的反序列化是指：根据某种遍历顺序得到的序列化字符串结果str，重构二叉树。
 *
 */
public class Solution {

    String str;

    public String Serialize(TreeNode root) {
        if (root == null) {
            return "#";
        }
        return root.val + "," + Serialize(root.left) + "," + Serialize(root.right);
    }

    //反序列化：根据某种(前序)遍历方式得到的序列化字符串结果，重构二叉树
    int index = 0;
    TreeNode Deserialize(String str) {
        if (null == str && str.length() == 0) {
            return null;
        }
        //以逗号分隔，返回一个字符串数组
        String[] strs = str.split(",");
        if (strs[index].equals("#")) {
            return null;
        }
        TreeNode leave = null;
        if (!strs[index].equals("#")) {
            leave = new TreeNode(Integer.valueOf(strs[index]));
            leave.left = Deserialize(str);
            leave.right = Deserialize(str);
        }
        return leave;
    }

}
