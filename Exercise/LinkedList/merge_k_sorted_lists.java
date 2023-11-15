package Exercise.LinkedList;


import java.awt.geom.Dimension2D;
import java.net.SocketTimeoutException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class merge_k_sorted_lists {

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(8);
        n3.next = n4;
        ListNode list[] = {n1,n2,n3};
        for(int i = 0 ; i < list.length ; i++){
            System.out.println(list[i]);
        }
        ListNode lists = mergeKLists(list);
        System.out.println(lists);


    }
    public static ListNode mergeKLists(ListNode[] lists) {
        ListNode head = new ListNode();
        ListNode node = head;
        int k = 0;
        while (true){
            int m = lists.length;
            int min = Integer.MAX_VALUE;
            for(int i = 0 ; i < lists.length ; i++){
                if(lists[i] == null){
                    m--;
                    continue;
                }

                if( lists[i].val < min){
                    min = lists[i].val;
                    k = i;
                }

            }
            if(m == 0){
                break;
            }
            node.next = lists[k];
            node = lists[k];
            lists[k] = lists[k].next;
        }
        return head.next;
    }


}
