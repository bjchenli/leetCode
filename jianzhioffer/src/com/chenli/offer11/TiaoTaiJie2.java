package com.chenli.offer11;

import java.util.ArrayList;

public class TiaoTaiJie2 {

    public boolean HasSubtree(TreeNode root1,TreeNode root2) {

        boolean result = false;

        //任意两颗子树
        if(root1!=null && root2!=null){

            if(root1.val == root2.val){
                //若根节点相同，则比较子节点是否相同
                result = DoesTreeHave(root1, root2);
            }
            if(!result){
                //若根节点不同，则比较左子节点是否和子树的根节点相同
                result = HasSubtree(root1.left,root2);
            }
            if(!result){
                //若根节点不同，则比较右子节点是否和子树的根节点相同
                result = HasSubtree(root1.right,root2);
            }
        }
        return result;
    }

    public boolean DoesTreeHave(TreeNode root1, TreeNode root2){

        if(root1 == null) return false;
        if(root2 == null) return true;

        if(root1.val != root2.val) return false;

        return DoesTreeHave(root1.left,root2.left) && DoesTreeHave(root1.right,root2.right);
    }
}


 class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }