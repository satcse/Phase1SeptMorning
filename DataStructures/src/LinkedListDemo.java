public class LinkedListDemo {

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

    // Method to insert a new node
    public static LinkedListDemo insert(LinkedListDemo list, int data)
    {
        //Create a new node with the given data
        Node new_node = new Node(data); // New node created with data=1 and next=null;
        new_node.next=null;

        //If the linked list is empty, then make the new node as head.
        if(list.head==null)
        {
            list.head = new_node; //Making the first new node as the Head node.
        }
        else
        {
            // To add a new node, traverse till the last node and insert the new_node there
            Node last = list.head;
            while(last.next!=null)
            {
                last=last.next;
            }
            last.next=new_node;
        }
        return list;

    }

    //Method to Print the List
    public static void printList(LinkedListDemo list)
    {
        Node currNode = list.head; // We got the first node here.
        System.out.print("Linked List: ");
        //Traverse through the full linked list.
        while(currNode.next!=null)
        {
            System.out.print(currNode.data+" ");
            currNode=currNode.next;
        }
        System.out.print(currNode.data+" ");
        System.out.println();
    }

    //Method to delete a node from the linked list
    public static LinkedListDemo deleteByKey(LinkedListDemo list, int key)
    {
        //Take Head node
        Node currNode=list.head, prev=null;
        //To delete the first node, just change the Head to the Second data.
        if(currNode!=null && currNode.data==key)
        {
            list.head = currNode.next;
            System.out.println(key + "found and deleted");
            return list;
        }
        //Finding the node to delete
        while(currNode!=null && currNode.data!=key)
        {
            prev=currNode;
            currNode=currNode.next;
        }
        if(currNode!=null)
        {
            prev.next = currNode.next;
            System.out.println(key +" found and deleted");
        }
        //Deleting the Last node
        if(currNode==null)
        {
            System.out.print("Key to delete Not Found! Invalid Key!!");
        }
        return list;
    }

    //Main method
    public static void main(String[] args) {
        LinkedListDemo list = new LinkedListDemo();
        //Insert the Values
        list = insert(list,1);
        list = insert(list,2);
        list = insert(list,3);
        list = insert(list,4);
        list = insert(list,5);
        list = insert(list,6);
        list = insert(list,7);
        list = insert(list,8);
        list = insert(list,9);
        //Print the list
        printList(list);

        //Delete Key 1
        deleteByKey(list, 1);
        // Print the LinkedList
        printList(list);
        // Delete node with value 4
        deleteByKey(list, 4);
        // Print the LinkedList
        printList(list);
        // Delete node with value 9
        deleteByKey(list, 10);
        // Print the LinkedList
        printList(list);

    }
}
