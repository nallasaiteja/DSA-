class Solution {
    public static void postorder(TreeNode root,ArrayList<Integer> arr){
        if(root == null){
            return;
        }
       postorder(root.left,arr);
       
       postorder(root.right,arr);
       arr.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> arr =  new ArrayList<>();
         postorder(root,arr);
         return arr;
    }
}