package p314;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Node implements Comparable<Node> {
    int x;
    int y;
    int val;

    public Node(int x, int y, int val) {
        this.x = x;
        this.y = y;
        this.val = val;
    }

    @Override
    public int compareTo(Node o) {
        if (this.x != o.x) {
            return this.x - o.x;
        }
        return this.y - o.y;
    }
}

class Solution {
    public List<List<Integer>> verticalOrder(TreeNode root) {
        // Null check
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        List<Node> treeNodes = new ArrayList<>();
        dfs(root, treeNodes, 0, 0);
        treeNodes.sort(Node::compareTo);

        int prevX = treeNodes.get(0).x;
        List<Integer> list = new ArrayList<>();
        for (Node node : treeNodes) {
            if (node.x != prevX) {
                result.add(list);
                list = new ArrayList<>();
                prevX = node.x;
            }
            list.add(node.val);
        }
        result.add(list);
        return result;
    }

    public void dfs(TreeNode root, List<Node> treeNodes, int x, int y) {
        if (root == null) {
            return;
        }
        treeNodes.add(new Node(x, y, root.val));
        dfs(root.left, treeNodes, x - 1, y + 1);
        dfs(root.right, treeNodes, x + 1, y + 1);
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");

    }

}

