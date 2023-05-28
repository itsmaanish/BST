class Solution
{
    int count = 0;
    
    void inRange(Node root, int l, int r) {
        if(root == null)
            return;
        
        if(root.data >= l && root.data <= r) {
            inRange(root.left, l, r);
            count++;
            inRange(root.right, l, r);
        }
        else if(root.data > r)
            inRange(root.left, l, r);
        else
            inRange(root.right, l, r);
    }
    int getCount(Node root,int l, int h)
    {
        inRange(root, l, h);
        return count;
    }
}
