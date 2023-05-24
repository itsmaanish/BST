class Solution
{
    Node bToDLL(Node root)
    { 
    Node head = null;
    return bdl(root,head);
        
    }
    Node bdl(Node root,Node head){
        if(root == null) return null;
        Node right=bdl(root.right,head);
        
        if(right!=null){
            root.right= right;
            right.left = root;
            head=root;
        }else  if(head!=null){
            head.left=root;
            root.right=head;
            head=root;
            
        }else{
            head=root;
        }
        
        Node left= bdl(root.left,head);
        if(left==null){
            return root;
        }else{
            return left;
        }
    }
    
}
