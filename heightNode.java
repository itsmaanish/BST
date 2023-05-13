class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node node) 
    {
        // Your code here
        ArrayList<Integer> list=new ArrayList<>();
        // base case
        // if(node==null)
        // return;
        Queue<Node> q=new LinkedList<Node>();
        q.add(node);
        
        while(q.isEmpty()==false){
            Node curr=q.poll();
            list.add(curr.data);
            // Left subtree
            if(curr.left!=null){
                q.add(curr.left);
            }
            // right subtree
            if(curr.right!=null){
                q.add(curr.right);
            }
        }
        return list;
        
    }
}
