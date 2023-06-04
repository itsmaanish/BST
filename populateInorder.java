class Solution{
    public void populateNext(Node root){
        
        if(root==null)
            return;
        Queue<Node> ans=new ArrayDeque<>();
       Stack<Node> st=new Stack<>();
       
       Node cur=root;
       while(cur!=null || !st.isEmpty())
       {
           while(cur!=null)
           {
               st.push(cur);
               cur=cur.left;
           }
           Node d=st.pop();
           ans.offer(d);
           cur=d.right;
          
       }
       while(!ans.isEmpty())
       {
           Node node=ans.remove();
           if(!ans.isEmpty())
           node.next=ans.peek();
       }
     
       
    }
}
