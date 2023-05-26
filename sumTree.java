class Solution

{

 boolean isSumTree(Node root)
 {
        return function(root);
 }

 boolean function(Node root){

      if(root==null)return true;

      if(root.left==null && root.right==null)return true;
      int sum=0;
      if(root.left!=null){
          sum+=bsum(root.left);//LEFT SUM
      }
      if(root.right!=null){
          sum+=bsum(root.right);//RIGHT SUM
      }

      return(sum==root.data && function(root.left) && function(root.right));

 }
 
 int bsum(Node root){

     if(root==null)return 0;
     if(root.left==null && root.right==null)return root.data;
     return root.data+bsum(root.left)+bsum(root.right);
 }
}
