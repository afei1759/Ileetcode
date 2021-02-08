package 分治法.q23_合并K个排序链表;

/**
 * @Description
 * @Author afei
 * @date:2021/2/8
 */
class Solution2 {
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
        ListNode head=null;
        if(one==null) return two;
        if(two==null) return one;
        if(one.val<=two.val){
            head=one;
            head.next=mergeTwoLists(one.next,two);
        }else{
            head=two;
            head.next=mergeTwoLists(one,two.next);
        }
        return head;
    }
}
