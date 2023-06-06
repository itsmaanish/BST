class Solution {
    private void inorder(Node root,int[] arr,int[] ans){
        if(root==null) return;
        
        inorder(root.left,arr,ans);
        arr[0]--;
        if(arr[0]==0){
            ans[0]=root.data;
        }
        inorder(root.right,arr,ans);
    }
    public int KthSmallestElement(Node root, int K) {
        // Write your code here
        int [] arr = {K};
        int [] ans = {-1};
        inorder(root,arr,ans);
        return ans[0];
    }
}
