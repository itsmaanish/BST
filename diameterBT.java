class Solution {
    
    int diameter(Node root) {
        // base case
        if(root==null){
            return 0;
        }
        
        // diameter for left and right subtree
        int diam1=diameter(root.left);
        int diam2=diameter(root.right);
        int diam3 = Height(root.left) + Height(root.right) + 1;
         return Math.max(diam3, Math.max(diam1, diam2));
    }
     int Height(Node root) {
        if (root == null) {
            return 0;
        }
        return Math.max(Height(root.left), Height(root.right)) + 1;
    }
}

