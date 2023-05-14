class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        Stack<Integer>st=new Stack<>();
        Queue<Node>q=new LinkedList<>();
    
          q.add(node);
          q.add(null);
          
          while(!q.isEmpty()){
        Node x=q.remove();
             if(x==null){
                 
                 if(q.isEmpty()){
                     break;
                 }
                 else{
                     q.add(x);
                 }
             }
             else{
                 st.push(x.data);
                 
                 if(x.right!=null){
                     q.add(x.right);
                 }
                 if(x.left!=null){
                     q.add(x.left);
                 }
             }
  
          }
          
          int i=0;
          ArrayList<Integer> arr=new ArrayList<>();
          while(!st.isEmpty()){
              arr.add(st.pop());
              i++;
          }
        return arr;
    }
}  
