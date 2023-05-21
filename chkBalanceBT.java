class Tree
{
      static int isBal(Node root){
        if(root==null) return 0;
        int lh = isBal(root.left);
        if(lh==-1) return -1;
        int rh = isBal(root.right);
        if(rh==-1) return -1;
        if(Math.abs(lh-rh)>1) return -1;
        return (Math.max(lh,rh)+1);
    }
    boolean isBalanced(Node root)
    {
        if(isBal(root)>-1){
            return true;
        }
        return false;
    }
}
