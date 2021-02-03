package hash相关.q1_两数之和;

/**
 * @Description
 * @Author afei
 * @date:2021/1/31
 */
class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        //暴力法：从下标1开始，不断取两个数相加判断是否等于target
        int[] rs=new int[2];
        for(int start=0;start<nums.length;start++){
            for(int end=start;end<nums.length;end++){
                if(nums[start]+nums[end]==target) {
                    rs[0]=start;
                    rs[1]=end;
                    return rs;
                }
            }
        }
        return rs;
    }
}
