package com.emmantoksjr.algorithms;

public class TreeTraversalWithBinaryTree {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(12);
        tree.root.right = new Node(13);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(6);

        System.out.println("Inorder Traversal");
        tree.inorder(tree.root);

        System.out.println("\nPreorder Traversal");
        tree.preorder(tree.root);

        System.out.println("\nPostorder Traversal");
        tree.postorder(tree.root);
    }
}
class Node{
    int item;
    Node left, right;

    public Node(int key) {
        this.item = key;
        this.left = this.right = null;
    }
}

class BinaryTree{
    Node root;

    public BinaryTree() {
        this.root = null;
    }

    public void inorder (Node node) {
        if (node == null)
            return;

        inorder(node.left);

        System.out.print(node.item + "->");

        inorder(node.right);
    }

    public void postorder (Node node) {
        if (node == null)
            return;

        postorder(node.left);

        postorder(node.right);

        System.out.print(node.item + "->");
    }

    public void preorder(Node node) {
        if (node == null)
            return;

        System.out.print(node.item + "->");

        preorder(node.left);

        preorder(node.right);
    }
}