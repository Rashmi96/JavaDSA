package DSA.trees;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class RightTree {
    Node root;
    Node temp = new Node(0);

    static class Node{
        int key;
        Node left;
        Node right;

        Node(int item){
            key = item;
            left = null;
            right = null;
        }
    }

    public void getRightTree(Node root){
        if(root == null){
            return;
        }

        getRightTree(root.left);

        root.left = null;
        temp.right = root;
        temp = root;
        getRightTree(root.right);

    }
    public Node increasingBST(Node root) {
        Node ans = temp;
        getRightTree(root);
        return ans.right;
    }


    public static void main(String[] args){
        RightTree binaryTree = new RightTree();

        Node root = new Node(5);
        binaryTree.root =root;
        root.left = new Node(2);
        root.right = new Node(6);
        root.left.left  = new Node(1);
        root.left.right = new Node(3);

        binaryTree.inOrder(binaryTree.root);

        System.out.println(binaryTree.search(root,2).key);

        binaryTree.inOrder(binaryTree.search(root,2));


    }

    private void inOrder(Node root){
        if(root == null){
            return;
        }

        inOrder(root.left);
        System.out.println(root.key);
        inOrder(root.right);
    }

    private Node search(Node root, int val){
        if(root == null)
            return null;

        if(root.key == val)
            return root;


        if(root.key > val){
            return search(root.left,val);
        }

        if(root.key < val){
            return search(root.right,val);
        }

        return root;
    }

}
