package hash相关.q387_字符串中的第一个唯一字符;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Description
 * @Author afei
 * @date:2021/2/1
 */
public class Solution1 {
    //hash:O(0),把字符串转为string[]得到单个字符，再把单个字符作为key，下标作为value存入map,若mao中有该key则移除该key，则map中第一个保存的key就是未重复的字符
    public int firstUniqChar(String s) {
        int rs=-1;
        Map<String,Integer> map=new LinkedHashMap<String,Integer>();
        String[] ss=s.split("");
        for(int i=0;i<ss.length;i++){
            if(map.containsKey(ss[i])) map.remove(ss[i]);
            else map.put(ss[i],i);
        }
        if(map.isEmpty()) return rs;
        Set<Map.Entry<String,Integer>> set=map.entrySet();
        for(Map.Entry<String,Integer> en:set){
            rs=en.getValue();
            return rs;
        }
        return rs;
    }
}
