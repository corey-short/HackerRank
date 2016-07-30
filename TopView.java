import java.util.*;

public class TopView {

    static void top_view(Node root) {
        
        if (root == null) { return; }
        
        Set<Integer> set = new HashSet<Integer>();
        
        Queue<QueueNode> queue = new LinkedList<>();
        
        queue.add(new QueueNode(root, 0));
        /* Level-order traversal, i.e. BFS */
        while (!queue.isEmpty()) {
            
            QueueNode qn = queue.remove();
            Node node = qn.getNode();
            int hd = qn.getDistanceFromRoot();
            
            if (!set.contains(hd)) {
                System.out.print(node.data + " ");
                set.add(hd);
            }
            
            if (node.left != null) {
                queue.add(new QueueNode(node.left, hd-1));
            }
            if (node.right != null) {
                queue.add(new QueueNode(node.right, hd+1));
            }   
        }
    }

    static class Node { 
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static class QueueNode {
        private int horizontalDistanceFromRoot;
        private Node node;
        
        public QueueNode(Node n, int hd) {
            this.horizontalDistanceFromRoot = hd;
            this.node = n;
        }
        
        public Node getNode() { return this.node; }
        public int getDistanceFromRoot() { return this.horizontalDistanceFromRoot; }
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.left.right.right = new Node(5);
        root.left.right.right.right = new Node(6);

        TopView.top_view(root);
    }
}

