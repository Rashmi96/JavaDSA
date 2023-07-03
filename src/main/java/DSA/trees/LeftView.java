package DSA.trees;


public class LeftView {

    static public int maxlevel = 0;

    static class Node{
        int key;
        Node left, right;

        Node(int item){
            key = item;
            left = right = null;
        }
    }

    private static void printLeftView(Node root) {
        printLeftView(root,0);
    }

    private static void printLeftView(Node root, int level) {
        if(root == null){
            return;
        }

        if(maxlevel < level){
            System.out.println(root.key);
            maxlevel = level;
        }

        printLeftView(root.left, level+1);

        printLeftView(root.right, level+1);
    }

    // Driver Code
    public static void main(String[] args)
    {
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(25);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);

        System.out.println(
                "Bottom view of the given binary tree:");

        printLeftView(root);
    }

}
