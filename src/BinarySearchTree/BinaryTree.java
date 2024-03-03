package BinarySearchTree;

import java.util.Scanner;

public class BinaryTree {
    public BinaryTree() {

    }

    public class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }

//        public Node(int value, Node left) {
//            this.value = value;
//            this.left = left;
//        }
//
//        public Node(int value, Node left, Node right) {
//            this.value = value;
//            this.left = left;
//            this.right = right;
//        }
    }
    private Node root;

    public void populate(Scanner scanner) {
        System.out.println("Enter the root node: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node) {
        System.out.println("Wanna insert left of " + node.value);
        boolean left = scanner.nextBoolean();
        if (left){
            System.out.println("Enter the value then: ");
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);

        }

        System.out.println("Wanna insert right of " + node.value);
        boolean right = scanner.nextBoolean();
        if (right){
            System.out.println("Enter the value then: ");
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }

    public void display(){
        display(root, "");
    }

    private void display(Node node, String indent) {
        if (node==null)
            return;
        System.out.println(indent + " " + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }
}

// Should try pretty printing ?
