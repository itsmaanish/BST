class GFG
{
    public static boolean isDeadEnd(Node root)
    {
        return isDead(root,1,200);
    }
    
    public static boolean isDead(Node root,int lowerBound,int upperBound){
        if(root==null)
        return false;
        if(lowerBound==upperBound)
        return true;
        return isDead(root.left,lowerBound,root.data-1) || isDead(root.right,root.data+1,upperBound);
    }
}
