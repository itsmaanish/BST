class Tree 
{
    int minValue(Node node) 
    {
        if(node == null) return -1;
        
        int intMinValue = Integer.MAX_VALUE;
        return preOrderUtil(node, intMinValue);
    }
    
    int preOrderUtil(Node root, int intMinValue)
    {
        if(root != null)
        {
            intMinValue = Math.min(intMinValue, root.data);
            
            intMinValue = preOrderUtil(root.left, intMinValue);
            intMinValue = preOrderUtil(root.right, intMinValue);
        }
        return intMinValue;
    }
}
