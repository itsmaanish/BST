public static Node post_order(int pre[], int size) 

{
  return preorder(pre,Integer.MAX_VALUE,new int[]{0});
} 
public static Node preorder(int pre[],int bound,int i[]){
    if(i[0]==pre.length || pre[i[0]]>bound) return null;
    Node root= new Node(pre[i[0]++]);
    root.left=preorder(pre,root.data,i);
    root.right=preorder(pre,bound,i);

    return root;

}
