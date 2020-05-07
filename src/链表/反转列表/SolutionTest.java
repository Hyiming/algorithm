package 链表.反转列表;

import 链表.ListNode;

/**
 * @ClassName SolutionTest
 * @Author huangyiming@sensetime.com
 * @Date 2020/4/7 23:49
 * @Description SolutionTest
 */
public class SolutionTest {
    public ListNode ReverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        // 当前节点
        ListNode cur = head;
        // 前驱节点
        ListNode pre = null;

        while (cur != null) {
            cur.next = pre ;
            pre = cur;
            cur = cur.next ;
        }
        return cur ;
    }
}
