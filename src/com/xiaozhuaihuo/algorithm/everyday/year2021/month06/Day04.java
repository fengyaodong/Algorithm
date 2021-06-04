package com.xiaozhuaihuo.algorithm.everyday.year2021.month06;

import com.xiaozhuaihuo.algorithm.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author <a href="mailto:fengyaodong@sfmail.sf-express.com">冯垚栋<a>
 * @version 1.0
 * @name @see com.xiaozhuaihuo.algorithm.everyday.year2021.month06
 * @date 2021/6/4 下午2:05
 * @description 160. 相交链表
 **/
public class Day04 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        Set<ListNode> visited = new HashSet<>();
        ListNode temp = headA;
        while (temp != null) {
            visited.add(temp);
            temp = temp.next;
        }
        temp = headB;
        while (temp != null) {
            if (visited.contains(temp)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {

        if (headA == null || headB == null) {
            return null;
        }
        ListNode pA = headA;
        ListNode pB = headB;
        while (pA != pB) {
            pA = pA == null ? pB : pA.next;
            pB = pB == null ? pA : pB.next;
        }
        return pA;
    }
}
