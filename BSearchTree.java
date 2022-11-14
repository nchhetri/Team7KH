public class BSearchTree
{
    static Node root;
    static class Node
    {
        Node left;
        int data;
        Node right;
        Node(int data) {
            this.left = null;
            this.data = data;
            this.right = null;
        }
    }
    void inorder(Node temp)
    {
        if(temp==null)
        {
            return;
        }
        inorder(temp.left);
        System.out.print(temp.data+" ");
        inorder(temp.right);
    }
    void preorder(Node temp)
    {
        if(temp==null)
        {
            return;
        }
        System.out.print(temp.data+" ");
        preorder(temp.left);
        preorder(temp.right);
    }
    void postorder(Node temp)
    {
        if(temp==null)
        {
            return;
        }
        postorder(temp.left);
        postorder(temp.right);
        System.out.print(temp.data+" ");
    }
    void insert(int key){root = insertrec(root,key);}

    Node insertrec(Node root, int key)
    {
        if(root==null)
        {
            root = new Node(key);
            return root;
        }
        else if(key<root.data)
        {
            root.left = insertrec(root.left,key);
        }
        else if (key> root.data)
        {
            root.right = insertrec(root.right,key);
        }
        return root;
    }

    public static void main(String[] args)
    {
        BSearchTree tree = new BSearchTree();
        tree.insert(400);
        tree.insert(14);
        tree.insert(15);
        tree.insert(16);
        tree.insert(200);
        tree.preorder(root);
        System.out.println();
        tree.postorder(root);
        System.out.println();
        tree.inorder(root);
    }
}
