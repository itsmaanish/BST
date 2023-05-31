class GfG {
    int findDist(Node root, int a, int b) {
        Node lcaVal=lca(root,a,b);
        int dist1=lcaDist(lcaVal,a);
        int dist2=lcaDist(lcaVal,b);
        return dist1+dist2;
    }
    
    Node lca(Node root,int a,int b){
        if(root==null || root.data==a || root.data==b){
            return root;
        }
        Node leftLca=lca(root.left,a,b);
        Node rightLca=lca(root.right,a,b);
        if(rightLca==null){
            return leftLca;
        }
        if(leftLca==null){
            return rightLca;
        }
        return root;
    }
    int lcaDist(Node root,int n){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int leftLca=lcaDist(root.left,n);
        int rightLca=lcaDist(root.right,n);
        if(leftLca==-1 && rightLca==-1){
            return -1;
        } else if(leftLca==-1){
            return rightLca+1;
        } else {
            return leftLca+1;
        }
    }
    
}
