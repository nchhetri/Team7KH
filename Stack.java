import java.util.Scanner;

public class Stack
{
    int top;
    int max = 5;
    int[] arr = new int[max];
    Stack(){this.top = -1;}

    boolean isEmpty()
    {
        return (top<0);
    }
    boolean push()
    {
        if(top==max-1)
        {
            System.out.println("Stack overflow!");
            return false;
        }
        else
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter value");
            int val = sc.nextInt();
            top++;
            arr[top] = val;
            System.out.println("Push success");
            return true;
        }

    }
    boolean pop()
    {
        if(top==-1)
        {
            System.out.println("Stack underflow!");
            return false;
        }
        else
        {
            top--;
            System.out.println("Pop success");
            return true;

        }
    }
    void display()
    {
        System.out.println("Printing stack elements :- ");
        System.out.println("==========");
        for(int i = top;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
        System.out.println("==========");
    }


    public static void main(String[] args) {
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        Stack s = new Stack();
        System.out.println("Stack operation started");
        while(choice!=4)
        {
            System.out.println("1.Push 2.Pop 3.Show 4.Exit Enter your choice");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> s.push();
                case 2 -> s.pop();
                case 3 -> s.display();
                case 4 ->
                {
                    System.out.println("Good bye !");
                    System.exit(0);
                }
                default -> System.out.println("Enter valid choice !!");
            }
        }
    }

}
