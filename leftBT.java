class Tree
{
  ArrayList<Integer> leftView(Node root)

    {

      ArrayList<Integer> res = new ArrayList<>();

      HashSet<Integer> hm = new HashSet<>();

      lfv(root,0,res,hm);

      return res;

    }

    void lfv(Node n,int l,ArrayList<Integer> res,HashSet<Integer> hm){

        if(n==null) return;

        if(hm.add(l))

            res.add(n.data);

        lfv(n.left,l+1,res,hm);

        lfv(n.right,l+1,res,hm);

    }
}
