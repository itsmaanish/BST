class Solution
{
    static class Info{
        int hd;
        Node node;
        public Info(int hd,Node node){
            this.hd=hd;
            this.node=node;
        }
    }
    public ArrayList <Integer> bottomView(Node root)
    {
        HashMap<Integer,Integer>map=new HashMap<>();
        Queue<Info>q=new LinkedList<>();
        ArrayList<Integer>arr=new ArrayList<>();
        
        int min =0;
        int max=0;
        
        if(root==null)return null;
        q.add(new Info(0,root));
        
        while(!q.isEmpty()){
             Info x=q.remove();
             
              map.put(x.hd,x.node.data);
              if(x.node.left!=null){
                  q.add(new Info(x.hd-1,x.node.left));
                  min=Math.min(min,x.hd-1);
                  
              }
              
              if(x.node.right!=null){
                  q.add(new Info(x.hd+1,x.node.right));
                  max=Math.max(max,x.hd+1);    
                  
              }
        }
        
        for(int i=min;i<=max;i++)
        {
            arr.add(map.get(i));
        }
        return arr;
        
        
    }
}
