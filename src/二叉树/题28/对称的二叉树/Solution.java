package 二叉树.题28.对称的二叉树;import 二叉树.TreeNode;public class Solution {    public void Mirror(TreeNode root){        TreeNode node ;        if (root != null){            node = root.left;            root.left=root.right;            root.right=node;            if (root.left!=null){                Mirror(root.left);            }            if (root.right!=null){                Mirror(root.right);            }        }    }}