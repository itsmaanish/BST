class Solution{
    public void toSumTree(Node root){
        Sum(root);
    }
    
    int Sum(Node root){
        if(root == null) return 0;
        
        int leftSum = Sum(root.left);
         int RightSum = Sum(root.right);
         
         int x= root.data;
         
         int totSum=leftSum + RightSum;
         root.data=totSum;
         return totSum+x;
    }
}
