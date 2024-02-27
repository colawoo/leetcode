package test;

import org.junit.Assert;
import org.junit.Test;
import common.ListNode;
import solution.MergeTwoSortedLists;

public class MergeTwoSortedListsTest {

    @Test
    public void testSolution1() {
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();

        ListNode list1_1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2_1 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode result1 = mergeTwoSortedLists.solution1(list1_1, list2_1);
        Assert.assertEquals("112344", printListNode(result1));

        ListNode list1_2 = null;
        ListNode list2_2 = null;
        ListNode result2 = mergeTwoSortedLists.solution1(list1_2, list2_2);
        Assert.assertEquals("", printListNode(result2));

        ListNode list1_3 = null;
        ListNode list2_3 = new ListNode(0);
        ListNode result3 = mergeTwoSortedLists.solution1(list1_3, list2_3);
        Assert.assertEquals("0", printListNode(result3));
    }

    @Test
    public void testSolution2() {
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();

        ListNode list1_1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2_1 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode result1 = mergeTwoSortedLists.solution2(list1_1, list2_1);
        Assert.assertEquals("112344", printListNode(result1));

        ListNode list1_2 = null;
        ListNode list2_2 = null;
        ListNode result2 = mergeTwoSortedLists.solution2(list1_2, list2_2);
        Assert.assertEquals("", printListNode(result2));

        ListNode list1_3 = null;
        ListNode list2_3 = new ListNode(0);
        ListNode result3 = mergeTwoSortedLists.solution2(list1_3, list2_3);
        Assert.assertEquals("0", printListNode(result3));
    }

    public String printListNode(ListNode listNode) {
        String ans = "";
        while (listNode != null) {
            ans += listNode.val;
            listNode = listNode.next;
        }
        return ans;
    }
}
