package Exercise.LinkedList;


import javax.xml.transform.Source;

/**
 * 回文链表
 * 给你一个单链表的头节点 head ，请你判断该链表是否为回文链表。如果是，返回 true ；否则，返回 false
 */
public class palindrome_linked_list {

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(2);
        ListNode n4 = new ListNode(1);
//        n1.next = n2 ;
//        n2.next = n3 ;
//        n3.next = n4 ;
        System.out.println(n1);
        palindrome_linked_list main = new palindrome_linked_list();
        System.out.println(main.isPalindrome(n1));

    }

    public boolean isPalindrome(ListNode head) {
        if(head == null){
            return true;
        }
        ListNode fast = head;
        ListNode slow = head;
        // 快慢指针，找到第二段链表开始的头结点cur
        while (fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode cur = slow.next;
        ListNode pre = null;
        //反转后半部分链表
        while (cur != null){
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        ListNode p1 = head;
        while (pre != null){
            if(pre.val != p1.val){
                return false;
            }
            p1 = p1.next;
            pre = pre.next;
        }
        return true;
    }



}
