public class CircularLinkedListDemo {

    //Create a Node
    Node head; // Head Node
    static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    CircularLinkedListDemo()
    {
        head=null;
    }

    //Method to Insert node into the Circular Linked List
    void invSortedInsert(Node new_node)
    {
        Node current = head;
        //Below if executes when if the CLL(Circular Linked List) is Empty!
        if(current == null)
        {
            new_node.next= new_node;
            head = new_node;
            System.out.println("Head Node Created");
        }
        else if(current.data >= new_node.data)
        {
            while(current.next!=head)
                current = current.next;
            current.next = new_node;
            new_node.next = head;
            head=new_node;
            System.out.println("1 Node Created: "+new_node.data);
        }
        else
        {
            while(current.next!=head && current.next.data < new_node.data)
            {
                current = current.next;
                new_node.next = current.next;
                current.next = new_node;
            }
            System.out.println("2 Node Created: "+new_node.data);
        }
    }

    //Method to Print the Linked List
    void printList()
    {
        if(head!=null)
        {
            Node temp = head;
            do {
                System.out.print(temp.data
                +" ");
                temp=temp.next;
            }while(temp!=head);
        }
    }

    //Main
    public static void main(String[] args) {
        CircularLinkedListDemo list = new CircularLinkedListDemo();
        int arr[] = new int[]{6,5,4,3,2,1};
        Node temp = null;
        for(int i =0;i< 6; i++)
        {
                temp = new Node(arr[i]);
                list.invSortedInsert(temp);
        }
        list.printList();
    }

}
