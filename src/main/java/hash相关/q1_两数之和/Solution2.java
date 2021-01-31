package hash相关.q1_两数之和;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Description
 * @Author afei
 * @date:2021/1/31
 */
public class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        //hashMap法：O(n)，不断把数组的数作为key存入map，它们的下标作为value；然后不断判断map中是否存在两个key的和为target，有则返回它们的下标
        int[] rs=new int[2];
        Map<Integer,Integer> map=new LinkedHashMap<Integer,Integer>();
        for(int start=0;start<nums.length;start++){
            if(map.containsKey(target-nums[start])){
                rs[0]=start;
                rs[1]=map.get(target-nums[start]);
                return rs;
                //return new int[]{rs,map.get(target-nums[start])};
            }
            map.put(nums[start],start);
        }
        return rs;
    }
}
