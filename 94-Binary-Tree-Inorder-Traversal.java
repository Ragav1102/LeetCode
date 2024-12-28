class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorderRec(root,list);
        return list;
    }
    private void inorderRec(TreeNode root, List<Integer> list)
    {
        if(root != null){
            inorderRec(root.left,list);
            list.add(root.val);
            inorderRec(root.right,list);
        }
    }
}