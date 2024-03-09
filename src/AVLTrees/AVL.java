package AVLTrees;

public class AVL {
    public class Node {
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    private Node root;
    public AVL() {

    }

    public int height(Node node){
        if (node==null)
            return -1;

        return node.height;
    }

    public boolean isEmpty(){
        return root==null;
    }

    public void display(){
        display(this.root, "Root Node");
    }

    private void display(Node node, String description) {
        if (node==null)
            return;

        System.out.println(description + node.value);
        display(node.left, "Left Node of "+ node.value + ": ");
        display(node.right, "Right Node of " + node.value + ": ");
    }


    public void insert(int value){
        root = insert(this.root, value);
    }

//    public void populate(int[] values){
//        for (int i = 0; i < values.length; i++) {
//            this.insert(values[i]);
//        }
//    }
    public void populate(int[] item) {
        for (int i = 0; i < item.length; i++) {
            this.insert(item[i]); // Corrected with `this.`
        }
    }

    private Node insert(Node node, int value){
        // This code will NOT alter the code in any way?
        if (node==null){
            return new Node(value);

        }
        if (value < node.value) {
            node.left = insert(node.left, value);
        }
        if (value > node.value){
            node.right = insert(node.right, value);
        }

        node.height = Math.max(height(node.left), height(node.right))+1;
        return rotate(node);
    }

    public Node rotate(Node node){

        if (height(node.left)- height(node.right) > 1){
            if (height(node.left.left) - height(node.left.right) > 0){
                return leftRotate(node);
            }
            if (height(node.left.left) - height(node.left.right) < 0){
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        if (height(node.right) - height(node.left) > 1){
            if (height(node.right.left) - height(node.right.right) > 0){
                return leftRotate(node);
            }
            if (height(node.right.left) - height(node.right.right) < 0){
                node.right = rightRotate(node.right);
                return rightRotate(node);
            }
        }
        return node;
    }


    // Left & Right Rotation is damn easy, Don't confuse yourself.
    // Take a pen & paper & balance the AVL Tree.
    private Node leftRotate(Node node){
        Node c = node.right;
        Node t = c.left;

        c.left = node;
        node.right = t;

        node.height = Math.max(height(node.left),height(node.right)+1);
        c.height = Math.max(height(c.left),height(c.right)+1);

        return node;
    }

    private Node rightRotate(Node node) {
        Node c = node.left;
        Node t = c.right;

        c.right = node;
        node.left = t;

        node.height = Math.max(height(node.left),height(node.right)+1);
        c.height = Math.max(height(c.left),height(c.right)+1);

        return c;

    }

    public boolean balanced(){
        return balanced(root);
    }

    private boolean balanced(Node node){
        if (node==null)
            return true;

        return Math.abs(height(node.left) - height(node.right)) <=1 && balanced(node.left) && balanced(node.right);
    }

    public void populateSorted(int[] values){
        poulateSorted(values, 0, values.length);
    }

    private void poulateSorted(int[] values, int start, int end) {
        // Time complexity of this function would be O(n*logn)
        if (start >= end)
            return;

        int mid = start + (end-start)/2;

        this.insert(values[mid]);

        poulateSorted(values, start, mid);
        poulateSorted(values, mid+1, end);
    }
}


//    public class BinarySearchTree {
//        public class Node {
//            private int value;
//            private Node left;
//            private Node right;
//            private int height;
//
//            public Node(int value) {
//                this.value = value;
//            }
//
//            public int getValue() {
//                return value;
//            }
//        }
//
//        private Node root;
//
//        public BinarySearchTree() {
//        }
//
//        public int height(Node node) {
//            if (node == null) {
//                return -1; // Height of an empty subtree is -1
//            }
//
//            return node.height;
//        }
//
//        public boolean isEmpty() {
//            return root == null;
//        }
//
//        public void display() {
//            display(this.root, "Root Node");
//        }
//
//        private void display(Node node, String description) {
//            if (node == null) {
//                return;
//            }
//
//            System.out.println(description + node.value);
//            display(node.left, "Left Node of " + node.value + ": ");
//            display(node.right, "Right Node of " + node.value + ": ");
//        }
//
//        public void insert(int value) {
//            root = insert(root, value);
//        }
//
//        public void populate(int[] values) { // Improved name for clarity
//            for (int i = 0; i < values.length; i++) {
//                this.insert(values[i]); // Corrected insertion call
//            }
//        }
//
//        private Node insert(Node node, int value) {
//            // Redundant comment removed
//            if (node == null) {
//                return new Node(value); // Base case: create new node
//            }
//
//            if (value < node.value) {
//                node.left = insert(node.left, value);
//            } else if (value > node.value) {
//                node.right = insert(node.right, value);
//            }
//
//            // Update height after insertion
//            node.height = Math.max(height(node.left), height(node.right)) + 1;
//
//            return node; // Return the (possibly) modified node
//        }
//
//        public boolean balanced() {
//            return balanced(root);
//        }
//
//        private boolean balanced(Node node) {
//            if (node == null) {
//                return true; // Empty tree is considered balanced
//            }
//
//            int balance = Math.abs(height(node.left) - height(node.right));
//            return balance <= 1 && balanced(node.left) && balanced(node.right);
//        }
//    }
//

