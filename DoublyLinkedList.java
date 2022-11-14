public class DoublyLinkedList
{
    Node head;
    static class Node
    {
        Node prev;
        int data;
        Node next;
        Node(int data)
        {
            this.prev = null;
            this.data = data;
            this.next = null;
        }
    }
    void addAtBeg(int data)
    {
        Node temp = new Node(data);
        temp.next = head;
        if(head!=null)
        {
            head.prev = temp;
        }
        head = temp;
    }
    void addAtEnd(int data)
    {
        Node temp = new Node(data);
        temp.next = null;
        Node ptr = head;
        if(head==null)
        {
            temp.prev = null;
            head = temp;
            return;
        }
        while(ptr.next!=null)
        {
            ptr = ptr.next;
        }
        ptr.next = temp;
        temp.prev = ptr;
    }
    void printList()
    {
        Node ptr = head;
        if(ptr==null)
        {
            System.out.println("List is empty");
            return;
        }
        while(ptr!=null)
        {
            System.out.print(ptr.data+" ");
            ptr = ptr.next;
        }
        System.out.println();
    }
    int listSize()
    {
        int count=0;
        Node ptr = head;
        while(ptr!=null)
        {
            count++;
            ptr=ptr.next;
        }
        return count;
    }
    void insertAtPos(int data, int pos)
    {
        Node temp = new Node(data);
        Node ptr = head;
        if(pos==0)
        {
            addAtBeg(data);
        }
        else
        {
            for(int i=0;i<pos-1 &&ptr!=null;i++)
            {
                ptr=ptr.next;
            }
            if(pos>listSize())
            {
                System.out.println("Mentioned position is out of bound for the list");
                return;
            }

            if(listSize()==pos)
            {
                addAtEnd(data);
                return;
            }
            assert ptr != null;
            temp.next = ptr.next;
            ptr.next.prev = temp;
            temp.prev = ptr;
            ptr.next = temp;
        }
    }
    void deleteAtPos(int pos)
    {
        Node ptr = head;
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        if(pos==0)
        {
            head = ptr.next;
            ptr.prev = null;
        }
        else
        {
            for(int i=0; i<pos-1 && ptr!=null;i++) {
                ptr = ptr.next;
            }
            ptr.next =  ptr.next.next;
            ptr.next.prev = ptr;
        }
    }
    public static void main(String[] args)
    {
        DoublyLinkedList list1  = new DoublyLinkedList();
        list1.addAtBeg(11);
        list1.printList();
        list1.deleteAtPos(0);
        list1.printList();
        //list1.addAtBeg(22);
        //list1.addAtBeg(33);
        //list1.printList();
        //list1.addAtEnd(100);
        //list1.printList();
        //list1.insertAtPos(200,1);
        //list1.printList();
        //list1.insertAtPos(300,0);
        //list1.printList();
        //list1.insertAtPos(400,6);
        //list1.printList();
        //System.out.println("List size is "+list1.listSize());
        //list1.deleteAtPos(4);
       // list1.printList();

    }
}