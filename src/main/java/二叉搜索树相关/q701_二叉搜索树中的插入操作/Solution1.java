package 二叉搜索树相关.q701_二叉搜索树中的插入操作;

/**
 * @Description  O(LOG2n),把新节点插入作为叶子节点
 * @Author afei
 * @date:2021/2/3
 */
//二叉排序树的节点删除操作
public class Solution1 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null) {
            TreeNode node=new TreeNode(val);
            return node;
        }
        if(root.val<val) root.right=insertIntoBST(root.right,val);
        if(root.val>val) root.left=insertIntoBST(root.left,val);
        return root;
    }
}
