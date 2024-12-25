class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) { 
            return ans;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int qsize = queue.size();
            int maxVal = Integer.MIN_VALUE;

            for (int i = 0; i < qsize; i++) {
                TreeNode curr = queue.poll();
                maxVal = Math.max(maxVal, curr.val);

                if (curr.left != null) {
                    queue.add(curr.left);
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                }
            }
            ans.add(maxVal);
        }
        return ans;
    }
}

