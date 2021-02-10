package 分治法.q33_搜索旋转排序数组;

/**
 * @Description
 * @Author afei
 * @date:2021/2/10
 */
public class Solution1 {
    public int search(int[] nums, int target) {
        //二分查找时间复杂度O[LOG2(n)],由题目可知：旋转后的数组在中间节点的左边或右边任意一边有序
        int left=0;
        int right=nums.length-1;
        int mid=(left+right)/2;
        while(left<=right){
            mid=(left+right)/2;
            if(nums[mid]==target) return mid;
            else if(nums[left]<=nums[mid]){//旋转后的数组在中间节点的左边有序
                if(nums[left]<=target&&target<nums[mid]) right=mid-1;  //且目标值在中间节点的左边
                else left=mid+1;  //且目标值在中间节点的右边
            }if(nums[mid]<nums[right]){//旋转后的数组在中间节点的右边有序
                if(nums[mid]<target&&target<=nums[right]) left=mid+1; //且目标值在中间节点右边
                else right=mid-1;
            }
        }
        return -1;
    }
}
