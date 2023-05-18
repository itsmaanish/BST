
class Solution{
    ArrayList<Integer> rightView(Node node) {
        
     ArrayList<Integer> result = new ArrayList<>();
        if (node == null) {
            return result;
        }
        
        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node curr = queue.poll();
                if (i == size - 1) {
                    result.add(curr.data);
                }
                if (curr.left != null) {
                    queue.offer(curr.left);
                }
                if (curr.right != null) {
                    queue.offer(curr.right);
                }
            }
        }
        return result;
    }
}
