package 分治法.q23_合并K个排序链表;

/**
 * @Description
 * @Author afei
 * @date:2021/2/8
 */
public class Solution1 {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        if(lists.length==1) return lists[0];
        //至少两个ListNode数组
        ListNode re=lists[0];
        for(int i=1;i<lists.length;i++){
            re=mergeTwoLists(re,lists[i]);
        }
        return re;
    }
    public ListNode mergeTwoLists(ListNode one,ListNode two){
        ListNode head=new ListNode(Integer.MAX_VALUE);
        ListNode pre=head;
        while(one!=null&&two!=null){
            if(one.val<=two.val) {
                pre.next=one;
                one=one.next;
            }else if(two.val<one.val){
                pre.next=two;
                two=two.next;
            }
            pre=pre.next;
        }
        if(one!=null) pre.next=one;
        else if(two!=null) pre.next=two;
        return head.next;
    }
}
