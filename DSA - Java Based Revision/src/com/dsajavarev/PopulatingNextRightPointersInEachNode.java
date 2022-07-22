package com.dsajavarev;

public class PopulatingNextRightPointersInEachNode {
    static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        root.right.left = new Node(6);
//                {1,2,3,4,5,6,7};
        System.out.println(connect(root));

    }
    public static Node connect(Node root) {
        Node black = root;
        while(black != null && black.left != null){
            Node n = black;

            while(true){
                n.left.next = n.right;

                if(n.next == null)
                    break;

                n.right.next = n.next.left;
                n = n.next;
            }
            black = black.left;
        }
        return root;
    }
}
