package hash相关.q387_字符串中的第一个唯一字符;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Description
 * @Author afei
 * @date:2021/2/3
 */
public class Solution2 {
    //hash:O(n),用map统计每个字符出现的次数
    public int firstUniqChar(String s) {
        int rs=-1;
        Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1) return  i;
        }
        return rs;
    }
}
