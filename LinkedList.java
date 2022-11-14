public class LinkedList
{
    static Node head = null;
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {this.data = data; this.next=null;}
    }
    public static void insertAtEnd(LinkedList list, int data)
    {
        //creating node
        Node temp = new Node(data);
        temp.next = null;
        //if linked list is empty
        if(head == null)
        {
            head = temp;
        }
        else
        {
            //else we will need to traverse till end of the list to add new node at the end
            Node ptr = head;
            while(ptr.next!=null)
            {
                ptr = ptr.next;
            }
            ptr.next = temp;
        }
    }
    public static void insertAtBeg(int data)
    {
        Node temp = new Node(data);
        temp.next = null;
        if(head==null)
        {
            temp=head;
        }
        else
        {
            temp.next = head;
            head = temp;
        }
    }
    public static void insertionAtPos(int data, int pos)
    {
        Node temp = new Node(data); //1 2 3 4 ->> temp ->>  5 6 7 8
        //temp.next = null;
        Node ptr = head;
        if(pos==0)
        {
            temp.next = head;
            head = temp;
        }
        else {
            for (int i = 0; i < pos - 1 && ptr!=null; i++) {
                ptr = ptr.next;
            }
            temp.next = ptr.next;
            ptr.next = temp;
        }

    }
    public static void deletionAtPos(int pos)
    {
        Node ptr = head;
        if(head==null)
        {
            System.out.println("List is Empty");
            return;
        }
        if(pos==0)
        {
            head = ptr.next;
            return;
        }
        for (int i=0;i<pos-1 && ptr!=null;i++)
        {
            ptr = ptr.next;
        }
        Node temp = ptr.next.next;
        ptr.next = temp;
    }
    public static void printList(LinkedList list)
    {
        Node ptr = head;
        while(ptr!=null)
        {
            System.out.print(ptr.data+" ");
            ptr = ptr.next;
        }
        System.out.println();
    }
    public static Node  reverseList(Node head)
    {
        Node prev = null;
        //Node current = head;
        Node next = null;
        while(head !=null)
        {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        head = prev;
        return head;
    }
    public static int listLength(Node head)
    {
        Node ptr = head;
        int count=0;
        while(ptr!=null)
        {
            ptr=ptr.next;
            count++;
        }
        return count;
    }
    public static void find(int element)
    {
        Node ptr = head;
        while(ptr!=null)
        {
            if(ptr.data==element)
            {
                System.out.println("Element found in the list");
                return;
            }
            ptr = ptr.next;
        }
        System.out.println("Element not found");
    }
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        insertAtEnd(list, 11);
        insertAtEnd(list, 12);
        insertAtEnd(list, 13);
        insertAtEnd(list, 14);
        insertAtEnd(list, 15);
        insertAtEnd(list, 16);
        insertAtEnd(list, 17);
        printList(list);
        insertionAtPos(230,0);
        insertAtBeg(10);
        printList(list);
        deletionAtPos(1);
        printList(list);
        head = reverseList(head);
        printList(list);
        System.out.println("Length of the list is "+listLength(head));
        find(200);
    }
}
