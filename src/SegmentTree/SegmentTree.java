package SegmentTree;


// Implementation of display & retrieval method are still pending.


public class SegmentTree {
    private class Node {
        private int value;
        private Node left;

        private int leftIndex;
        private int rightIndex;
        private Node right;
        private int height;

        public Node(int leftIndex, int rightIndex) {
            this.leftIndex = leftIndex;
            this.rightIndex = rightIndex;
        }

        public int getValue() {
            return value;
        }
    }

    private Node root;

    public SegmentTree(int[] nums) {
        constructTree(nums, 0, nums.length);
    }


    // Practice Recursion like hell.
    private Node constructTree(int[] nums, int start, int end) {

        if (start == end) {
            Node one = new Node(start, end);
            one.value = nums[start];
            return one;
        }
        int mid = start + (end-start)/2;
        Node one = new Node(start, end);

        one.left = this.constructTree(nums, start, mid);
        one.right = this.constructTree(nums, mid+1, end);

        one.value = one.left.value + one.right.value;
        return one;
    }

    public void update(int index, int newValue){
        update(root, index, newValue);
    }


    // Check for integrity.
    private Node update(Node currentNode, int index, int newValue) {
        if (currentNode.leftIndex == currentNode.rightIndex){
            currentNode.value = newValue;
            return currentNode;
        }

        if (index >= currentNode.leftIndex && index <= currentNode.rightIndex){
            Node left = update(currentNode.left, index, newValue);
            Node right = update(currentNode.right, index, newValue);

            currentNode.value = left.value + right.value;
        }
        return currentNode;
    }


}
//    public int height(Node node){
//        if (node==null)
//            return -1;
//
//        return node.height;
//    }
//
//    public boolean isEmpty(){
//        return root==null;
//    }
//
//    public void display(){
//        display(this.root, "Root Node");
//    }
//
//    private void display(Node node, String description) {
//        if (node==null)
//            return;
//
//        System.out.println(description + node.value);
//        display(node.left, "Left Node of "+ node.value + ": ");
//        display(node.right, "Right Node of " + node.value + ": ");
//    }
//
//
//    public void insert(int value){
//        root = insert(this.root, value);
//    }
//
////    public void populate(int[] values){
////        for (int i = 0; i < values.length; i++) {
////            this.insert(values[i]);
////        }
////    }
//    public void populate(int[] item) {
//        for (int i = 0; i < item.length; i++) {
//            this.insert(item[i]); // Corrected with `this.`
//        }
//    }
//
//    private Node insert(Node node, int value){
//        // This code will NOT alter the code in any way?
//        if (node==null){
//            return new Node(value);
//
//        }
//        if (value < node.value) {
//            node.left = insert(node.left, value);
//        }
//        if (value > node.value){
//            node.right = insert(node.right, value);
//        }
//
//        node.height = Math.max(height(node.left), height(node.right))+1;
//        return node;
//    }
//
//    public boolean balanced(){
//        return balanced(root);
//    }
//
//    private boolean balanced(Node node){
//        if (node==null)
//            return true;
//
//        return Math.abs(height(node.left) - height(node.right)) <=1 && balanced(node.left) && balanced(node.right);
//    }
//
//    public void populateSorted(int[] values){
//        poulateSorted(values, 0, values.length);
//    }
//
//    private void poulateSorted(int[] values, int start, int end) {
//        // Time complexity of this function would be O(n*logn)
//        if (start >= end)
//            return;
//
//        int mid = start + (end-start)/2;
//
//        this.insert(values[mid]);
//
//        poulateSorted(values, start, mid);
//        poulateSorted(values, mid+1, end);
//    }
//}

