class GFG
{
    //Function to store the zig zag order traversal of tree in a list.
	ArrayList<Integer> zigZagTraversal(Node root)
    {
        Queue<Node> q = new LinkedList<Node>();
        ArrayList<Integer> res = new ArrayList<Integer>();
        q.add(root);
        
        boolean flag = true;
        while(!q.isEmpty())
        {
            int nodeCount = q.size();
            ArrayList<Integer> arr = new ArrayList<Integer>();
            for(int i=0;i<nodeCount;i++)
            {
                Node temp = q.poll();
                arr.add(temp.data);
                if(temp.left!=null)
                    q.add(temp.left);
                if(temp.right!=null)
                    q.add(temp.right);
               
            }
            if(flag)
            {
                res.addAll(arr);
            }
            else
            {
                Collections.reverse(arr);
                res.addAll(arr);
            }
            flag=!flag;
        }
        return res;
    }
}
