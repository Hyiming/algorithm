package 题35.复杂链表的复制;

/**
 * @ClassName RandomListNode
 * @Author huangyiming@sensetime.com
 * @Date 2020/3/17 17:48
 * @Description RandomListNode
 */

// 输入一个复杂链表（每个节点中有节点值，以及两个指针，
// 一个指向下一个节点，另一个特殊指针指向任意一个节点），


public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}