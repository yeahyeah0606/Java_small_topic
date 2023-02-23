//  144. Binary Tree Preorder Traversal
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        getTree(root, result);
        return result;
    }

    public void getTree(TreeNode root, List<Integer> result){
        if( root == null ){
            return;
        }
        result.add(root.val);
        getTree(root.left, result);
        getTree(root.right, result);
    }
}