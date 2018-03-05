public class AddTwoNumbers_2 {

    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        //新建一个链表来存储结果
        ListNode head = new ListNode(0);
        ListNode prev = head;

        //初始化总和以及进位为0
        int sum = 0;
        int carry = 0;

        //当l1或者l2以及carry三者中任何一个满足下列条件都可以继续循环
        //1、l1和l2不为空时需要进行计算
        //2、进位carry不为0时也还要进行计算
        while ( l1 != null || l2 != null || carry !=0 ){
            //新建一个临时变量，存储链表l1和l2各个位置上的加和结果
            ListNode current = new ListNode(0);
            sum = (l1 == null ? 0:l1.val) + (l2 == null ? 0:l2.val) + carry;
            //计算存在链表当前位置的val
            current.val = sum % 10;
            //计算当前位置l1和l2的结果是否需要向前进位
            carry = sum / 10;
            //在新建存储结果的链表上添加新的元素
            prev.next = current;
            //将prev.next赋值给prev，便于进行下一次的循环
            prev = prev.next;

            //迭代l1.next和l2.next来进行下次循环
            l1 = (l1 == null) ? l1 : l1.next;
            l2 = (l2 == null) ? l2 : l2.next;
        }
        return head.next;
    }
}
