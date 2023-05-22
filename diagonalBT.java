class Tree
{
     public ArrayList<Integer> diagonal(Node root)
     {
        ArrayList<Integer> ans=new ArrayList<>(); 
        Queue<Node> q=new LinkedList<>();
        Node curr=root;
        while(curr!=null) {
            ans.add(curr.data);
            if(curr.left!=null) q.add(curr.left);
            if(curr.right==null) {
                curr=q.poll();
            }
            else curr=curr.right;
        }
        return ans;
     }
}
