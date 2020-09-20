package alg;

public class Linkin {
    public static void  main(String []args){

    }

    /**
     *
     * 设 A 的长度为 a + c，B 的长度为 b + c，其中 c 为尾部公共部分长度，可知 a + c + b = b + c + a。
     *
     * 当访问 A 链表的指针访问到链表尾部时，令它从链表 B 的头部开始访问链表 B；同样地，当访问 B 链表的指针访问到链表尾部时，令它从链表 A 的头部开始访问链表 A。这样就能控制访问 A 和 B 两个链表的指针能同时访问到交点。
     *
     * 如果不存在交点，那么 a + b = b + a，以下实现代码中 l1 和 l2 会同时为 null，从而退出循环。
     * @param headA
     * @param headB
     * @return
     */
    public static ListNode getIntersectionNode(ListNode headA,ListNode headB){
        ListNode l1 = headA,l2 = headB;
        while(l1 != l2){
           l1 = (l1 == null ) ? headB :l1.next;
           l2 = (l2 == null) ? headA:l2.next;
        }
        return l1;
    }

    /**
     * 链表反转 递归
     * @param head
     * @return
     */
    public static ListNode reverseList(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode next = head.next;
        ListNode newHead = reverseList(next);
        next.next = head;
        head.next = null;
        return newHead;
    }

    /**
     * 头插法
     * @param node
     * @return
     */
    public static ListNode reverseList2(ListNode node){
        ListNode newHead = new ListNode(-1);
        while(node != null){
            ListNode next = node.next;
            node.next = newHead.next;
            newHead.next = node;
            node = next;
        }
        return newHead.next;
    }

    /**
     * 归并两个有序的链表
     *
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode mergeTwoLists(ListNode l1,ListNode l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        if(l1.value < l2.value){
            l1.next = mergeTwoLists(l1.next,l2);
            return l1;
        }else{
            l2.next = mergeTwoLists(l1,l2.next);
            return l2;
        }
    }

    /**
     * 从有序链表中删除重复节点
     * @param head
     * @return
     */
    public static ListNode deteleDuplicates(ListNode head){
        if(head == null || head.next == null) return head;
        head.next = deteleDuplicates(head.next);
        return head.value == head.next.value ? head.next: head;
    }

    public static  ListNode removeNthFromEnd(ListNode head,int n){
        ListNode fast = head;
        while(n-- > 0){
            fast = fast.next;
        }
        if(fast == null) return head.next;
        ListNode slow = head;
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
