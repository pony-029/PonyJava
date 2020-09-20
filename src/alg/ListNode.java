package alg;

public class ListNode {
     ListNode head;
     ListNode next;
     public int value;
    ListNode(int value){
         this.value = value;
    }
    ListNode(ListNode head,ListNode next,int value){
        this.head = head;
        this.next = next;
        this.value = value;
    }

}
