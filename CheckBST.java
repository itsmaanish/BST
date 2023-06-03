
public class Solution
{
    
   static int min = Integer.MIN_VALUE;
   static int max = Integer.MAX_VALUE;
    //Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root)
    {
       return  isBSTCheck(root,min,max);
    }
    
    static boolean isBSTCheck(Node root,int min,int max){
        //base case
        if(root==null)
        return true;
        
        return ((root.data > min) && (root.data < max) && isBSTCheck(root.left,min,root.data) && isBSTCheck(root.right,root.data,max));
  
    }
 
}
