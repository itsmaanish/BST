class Solution {
    int maxSum = Integer.MIN_VALUE;

    public int sumOfLongRootToLeafPath(Node root) {
        int maxHeight = height(root);
        helper(root, 0, 0, maxHeight);
        return maxSum;
    }

    private void helper(Node root, int sum, int height, int maxHeight) {
        if (root == null) {
            if (height == maxHeight) {
                maxSum = Math.max(maxSum, sum);
            }
            return;
        }
        helper(root.left, sum+root.data, height + 1, maxHeight);
        helper(root.right, sum+root.data, height + 1, maxHeight);
    }

    private int height(Node root) {
        if (root == null) {
            return 0;
        }

        int left = height(root.left);
        int right = height(root.right);

        return 1 + Math.max(left, right);
    }
}
