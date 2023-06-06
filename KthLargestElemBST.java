class Solution
{
    public static int revMorrisInorder(Node root,int k) {
        int count = 0;
        while (root != null) {
            if (root.right == null) {
                if(++count == k)
                    return root.data;
                root = root.left;
            } else {
                Node temp = root.right;
                while (temp.left != null && temp.left != root)
                    temp = temp.left;
                if (temp.left == null) {
                    temp.left = root;
                    root = root.right;
                } else {
                    temp.left = null;
                    if(++count == k)
                        return root.data;
                    root = root.left;
                }
            }
        }
        return -1;
    }
    public int kthLargest(Node root,int k)
    {
        if(root == null)
            return -1;
        return revMorrisInorder(root,k);
    }
}
