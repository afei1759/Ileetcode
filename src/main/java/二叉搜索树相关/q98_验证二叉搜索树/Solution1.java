package 二叉搜索树相关.q98_验证二叉搜索树;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description  O(n)
 * @Author afei
 * @date:2021/2/5
 */
public class Solution1 {
    private List<Integer> list=new ArrayList<Integer>();
    public void read(TreeNode root){
        if(root==null) return ;
        read(root.left);
        list.add(root.val);
        read(root.right);
    }


    public boolean isValidBST(TreeNode root) {
        //二叉搜索数的中序遍历为是有序的,构造中序遍历
        read(root);
        //判断中序遍历是否有序
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>=list.get(i+1)) return false;
        }
        return true;
    }
}
