package 二叉搜索树相关.q450_删除二叉搜索树中的节点;

/**
 * @Description 定义二叉排序树
 * @Author afei
 * @date:2021/2/3
 */
public class TreeNode {
    int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
          this.left = left;
          this.right = right;
      }
}
