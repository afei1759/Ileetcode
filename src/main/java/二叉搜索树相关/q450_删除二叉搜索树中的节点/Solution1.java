package 二叉搜索树相关.q450_删除二叉搜索树中的节点;

/**
 * @Description 假设树的高度为h,节点数为n,则最好的情况：该二叉排序树为完全二叉树，Tn=O(Log2(n))；最坏情况:该二叉树完全不平衡，高度h等于节点数n，Tn=O(n)
 * @Author afei
 * @date:2021/2/3
 */
//二叉排序树的节点删除操作
public class Solution1 {
    //返回前驱的节点值
    public int preNode(TreeNode root){
        root=root.left;
        while(root.right!=null) root=root.right;
        return root.val;
    }
    //返回后继节点值
    public int postNode(TreeNode root){
        root=root.right;
        while(root.left!=null) root=root.left;
        return root.val;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        if(key>root.val){
            root.right=deleteNode(root.right,key);
        }else if(key<root.val){
            root.left=deleteNode(root.left,key);
        }else {//root.val等于key
            if(root.left==null&&root.right==null) root=null;
            else if(root.right!=null) {
                root.val=postNode(root);
                root.right=deleteNode(root.right,root.val);
            }else{//root.left非空
                root.val=preNode(root);
                root.left=deleteNode(root.left,root.val);
            }
        }
        return root;
    }
}
