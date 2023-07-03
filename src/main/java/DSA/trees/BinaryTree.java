package DSA.trees;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class BinaryTree {

    Node root;

    class Node{
        int key;
        Node left;
        Node right;

        Node(int item){
            key = item;
            left = null;
            right = null;
        }
    }

    //InOrder traversal of a Tree
    public void inOrderTraverse(Node root){
        if(root == null)
            return;

        inOrderTraverse(root.left);
        System.out.println(root.key);
        inOrderTraverse(root.right);
    }

    //preOrder traversal of a Tree
    public void preOrderTraverse(Node root){
        if(root == null)
            return;

        System.out.println(root.key);
        preOrderTraverse(root.left);
        preOrderTraverse(root.right);
    }

    //PostOrder traversal of a Tree
    public void postOrderTraverse(Node root){
        if(root == null)
            return;

        postOrderTraverse(root.left);
        postOrderTraverse(root.right);
        System.out.println(root.key);
    }

    //LevelOrder traversal of a Tree
    public void levelOrderTraverse(Node root){
        if(root == null)
            return;

        Queue<Node> nodes = new LinkedList<>();
        nodes.add(root);
        while(!nodes.isEmpty()){
            Node temp = nodes.peek();
            nodes.poll();

            System.out.println(temp.key);

            if(Objects.nonNull(temp.right)){
                nodes.add(temp.right);
            }
            if(Objects.nonNull(temp.left)){
                nodes.add(temp.left);
            }
        }
    }

    public void insert(int key){

        root =  insertKey(root,key);
    }

    //Insert into a BST
    public Node insertKey(Node root, int item){

        if(root == null) {
            root = new Node(item);
            return root;
        }
        if(item < root.key)
            root.left = insertKey(root.left,item);

        else if(item > root.key)
            root.right = insertKey(root.right,item);

        return root;
    }

    public Node deleteKey(Node root, int item){
        if(root == null)
            return null;

        if(root.left == null && root.right == null){
            return (root.key == item) ? root : null;
        }

        Queue<Node> nodes = new LinkedList<>();
        nodes.add(root);

        Node temp = null, keyNode = null, last = null;

        while(!nodes.isEmpty()){
            temp = nodes.peek();
            nodes.poll();

            if(temp.key == item)
                keyNode = temp;

            if(Objects.nonNull(temp.left)){
                nodes.add(temp.left);
                last = temp;
            }

            if(Objects.nonNull(temp.right)){
                nodes.add(temp.right);
                last = temp;
            }
        }

        if(Objects.nonNull(keyNode)){
            keyNode.key = temp.key;

            if(last.left == temp){
                last.left = null;
            }

            if(last.right == temp){
                last.right = null;
            }
        }

        return root;

    }

    //height of a Tree
    public int getHeight(Node root){
        if(root == null)
            return 0;

        int height = Math.max(getHeight(root.left), getHeight(root.right)) +1;
        return height;
    }

    public static void main(String[] args){
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(1);
        binaryTree.insert(2);
        binaryTree.insert(5);
        binaryTree.insert(3);
        binaryTree.insert(9);

        binaryTree.levelOrderTraverse(binaryTree.root);

//        binaryTree.deleteKey(binaryTree.root, 5);

//        binaryTree.levelOrderTraverse(binaryTree.root);

    }
}
