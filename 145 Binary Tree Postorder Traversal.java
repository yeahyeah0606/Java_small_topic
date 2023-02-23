// 145. Binary Tree Postorder Traversal

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        getTree(root, result);
        return result;       
    }

     public void getTree(TreeNode root, List<Integer> result){
        if( root == null ){
            return;
        }
        getTree(root.left, result);
        getTree(root.right, result);
        result.add(root.val);
    }   
}