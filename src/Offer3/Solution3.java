package Offer3;import javax.crypto.SecretKeyFactory;import java.util.ArrayList;import java.util.Stack;class ListNode {    int val;    ListNode next = null;    ListNode(int val) {        this.val = val;    }}public class Solution3 {    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {        Stack<Integer> stack = new Stack<>();        while (listNode != null) {            stack.push(listNode.val);            listNode = listNode.next;        }        ArrayList<Integer> list = new ArrayList<>();        while (!stack.isEmpty()) {            list.add(stack.pop());        }        return list;    }}