package 字符串操作.q43_大数相乘;

/**
 * @Description 思路：模拟手算过程，用长度大的数乘以长度短的数
 * @Author afei
 * @date:2021/6/26
 */
class Solution {
    public String multiply(String num1, String num2) {
        int[] sum=new int[num1.length()+num2.length()];//计算结果最多num.length()+num2.length()位数
        //两层循环：外层循环是由尾到前依次遍历长度小的数git remot
        //        内存循环是由尾到前依次遍历长度大的数，在内层循环中，依次用大数的每一位乘以小数当前位
        for(int i=num1.length()-1;i>=0;i--){
            for(int j=num2.length()-1;j>=0;j--){
                int b=(num2.charAt(j)-'0')*(num1.charAt(i)-'0');//b=老乘值
                b=b+sum[i+j+1]; //sum[i+j+1]代表当前位在上一轮内循环后的值，新乘值b=老乘值+当前位在上一轮内循环后的值
                sum[i+j+1]=b%10;//重赋当前位值=新乘值%10求余
                sum[i+j]=b/10+sum[i+j];//sum[i+j]代表当前位的前一位值=新乘值/10求整+内循环中该位上一轮的结果
            }
        }
        //输出
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<sum.length-1&&sum[i]==0) i++; //写成“i<sum.length-1”，可以在num1=num2=0时，保留sum数组最后那个0不被过滤掉可以被输出
        while(i<sum.length) sb.append(sum[i++]);
        return sb.toString();
    }
}
