public class BTree
{
    static Node root;
    static Node temp = root;
    static class Node
    {
        Node left;
        int data;
        Node right;
        Node(int data)
        {
            this.left = null;
            this.data = data;
            this.right = null;
        }
    }
    static void inorder(Node temp)
    {
        if(temp==null)
        {
            return;
        }
        inorder(temp.left);
        System.out.print(temp.data+" ");
        inorder(temp.right);
    }
    static void preorder(Node temp)
    {
        if(temp==null)
        {
            return;
        }
        System.out.print(temp.data+" ");
        preorder(temp.left);
        preorder(temp.right);
    }
    static void postorder(Node temp)
    {
        if(temp==null)
        {
            return;
        }
        postorder(temp.left);
        postorder(temp.right);
        System.out.print(temp.data+" ");
    }
    public static void main(String[] args)
    {
        root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        inorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        preorder(root);


    }
}
