public class StackDemo {
    static final int MAX=1000;
    int top;
    int stack[]=new int[MAX];

    StackDemo()
    {
        top=-1;
    }
    boolean isEmpty()
    {
        return (top < 0);
    }

    boolean push(int x) // For adding elements to the stack
    {
        if(top >=(MAX-1)) // Checking the Stack if it's Full
        {
            System.out.println("Stack Overflow");
            return false;
        }
        else
        {
            stack[++top]=x; // Adding data to the stack. stack[++(-1)]=stack[0]=x; stack[1]=x; stack[2]=x;
            System.out.println(x+ " pushed into stack");
            return true;
        }
    }

    int pop() // For Deleting the element from the stack and returning the deleted element.
    {
        if (top < 0)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else
        {
            int x = stack[top--];// x= stack[10] and top is 10 -> 9; x= stack[9] and top is 9 -> 8
            return x;
        }
    }

    public static void main(String[] args) {
        StackDemo s = new StackDemo();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println(s.pop()+ " Popped from stack");
    }
}
