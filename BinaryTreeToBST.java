class Solution
{
    Node binaryTreeToBST(Node root)
    {
        ArrayList<Integer> list = new ArrayList<>();
        inorder(list, root);
        Collections.sort(list);
        inorderToBST(list, root, 0);
        return root;
    }
    
    void inorder(ArrayList<Integer> list, Node root){
        if(root == null) return;
        
        inorder(list,root.left);
        list.add(root.data);
        inorder(list,root.right);
        
    }
    
    void inorderToBST(ArrayList<Integer> list, Node root, int i){
        if(root == null) return ;
        
        inorderToBST(list, root.left, i);
        root.data = list.remove(i);
        inorderToBST(list, root.right, i);
        
    }
}
