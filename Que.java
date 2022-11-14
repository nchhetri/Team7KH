import java.util.Scanner;

public class Que
{
    Scanner sc = new Scanner(System.in);
    int front, rear, capacity;
    int [] arr;
    Que(int size)
    {
        front = rear = 0;
        capacity = size;
        arr = new int[capacity];
    }

    void enQue()
    {
        if(capacity==rear)
        {
            System.out.println("Que is full");
            return;
        }
        else
        {
            System.out.println("Enter value");
            int val = sc.nextInt();
            arr[rear]=val;
            rear++;
        }
        return;
    }
    void deQue()
    {
        if(front==rear)
        {
            System.out.println("Que is empty");
            return;
        }
        else
        {
            for(int i =0; i<rear-1;i++)
            {
                arr[i]=arr[i+1];
            }
        }
        if(rear<capacity)
        {
            arr[rear]=0;
            rear--;
        }
        return;
    }
    void display()
    {
        if(front==rear)
        {
            System.out.println("Que is empty");
            return;
        }
        for(int i=front; i<rear;i++)
        {
            System.out.print(arr[i]+" ");
        }
        return;
    }

    public static void main(String[] args) {
        Que Q = new Que(4);
        int choice = 0;
        System.out.println("Que started");
        while(choice!=4)
        {
            System.out.println("1. To insert, 2. To deque,  3. display   4.Exit");
            choice = Q.sc.nextInt();
            switch (choice)
            {
                case 1 -> Q.enQue();
                case 2-> Q.deQue();
                case 3-> Q.display();
                case 4-> {System.out.println("Good bye!!");System.exit(0);}
                default -> System.out.println("Incorrect choice");
            }
        }
    }
}
