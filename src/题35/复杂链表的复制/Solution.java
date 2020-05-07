package 题35.复杂链表的复制;

/**
 * @ClassName Solution
 * @Author huangyiming@sensetime.com
 * @Date 2020/3/17 17:47
 * @Description Solution
 */
// 题目描述
// 输入一个复杂链表（每个节点中有节点值，以及两个指针，
// 一个指向下一个节点，另一个特殊指针指向任意一个节点），
// 返回结果为复制后复杂链表的 head。
// （注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）

public class Solution {

    // 操作分为三步
    // 第一步复制当前节点
    // 第二部复制随机节点
    // 第三步拆分

    public RandomListNode Clone(RandomListNode pHead) {
        if (null == pHead) {
            return null;
        }

        RandomListNode currenteNode = pHead;
        // 第一步复制
        while (null != currenteNode) {
            // 生成一个节点值等于当前节点
            RandomListNode clone = new RandomListNode(currenteNode.label);
            // 将复制节点插入当前节点后面
            clone.next = currenteNode.next;
            currenteNode.next = clone;
            currenteNode = clone.next;
        }

        // 复制随机节点
        currenteNode = pHead;
        while (null != currenteNode) {
            RandomListNode clone = currenteNode.next;
            if (null != currenteNode.random) {
                clone.random = currenteNode.random.next;
            }
            currenteNode = clone.next;
        }

        // 拆分
        currenteNode = pHead;
        RandomListNode pCloneHead = pHead.next;
        while (currenteNode.next != null) {
            RandomListNode next = currenteNode.next;
            currenteNode.next = next.next;
            // 原节点和复制节点来回切换
            currenteNode = next;
        }
        return pCloneHead;
    }
}