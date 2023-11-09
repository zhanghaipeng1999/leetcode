package Interview.Baidu;

import Exercise.LinkedList.ListNode;

public class Merge_two_sorted_lists {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(1, l1);
        System.out.println(l2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(2, l3);
        System.out.println(l4);
        ListNode twoLists = mergeTwoLists(l2, l4);
        System.out.println(twoLists);
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode curr = head;

        while (list1 != null && list2 != null){
            if(list1.val <= list2.val){
                curr.next = list1;
                list1 = list1.next;
            }else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }
        if(list1 != null ){
            curr.next = list1;
        }
        if (list2 != null){
            curr.next = list2;
        }
        return head.next;
    }
}
