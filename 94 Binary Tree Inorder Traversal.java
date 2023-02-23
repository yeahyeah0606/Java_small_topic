//94. Binary Tree Inorder Traversal

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        getTree(root, result);
        return result;
    }

    public void getTree(TreeNode root, List<Integer> result){
        if( root == null ){
            return;
        }
        getTree(root.left, result);
        result.add(root.val);
        getTree(root.right, result);
    }

}