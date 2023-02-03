
public class LinkedList{
    Node head;
    private int size;
    LinkedList(){
        this.size = 0;
    }
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
            size++; 
        }
    }
    //adding at first of the list
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        
        newNode.next = head;
        head = newNode;
    }
    //adding at last of the list
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    //printing the list
    public void printList(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.print("NULL");
    }
    // deleting the first element of the list
    public void delFirst(){
        if(head == null){
            System.out.println("the list is empty");
            return;
        }
        size--;
        head = head.next;
    }
    //deleting th last element of the list
    public void delLast(){
        if(head == null){
            System.out.println("the list is empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
    public int getSize(){
        return size;
    }
    //reversing the list by iteration
    public void reverseIterate(){
        if(head == null || head.next == null){
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;

        }
        head.next = null;
        head = prevNode;
    }
    //reversing the list by Recursion
    public Node reverseRecursive(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public static void main(String [] args){
        LinkedList list = new LinkedList();
        list.addFirst("a");
        list.addFirst("is");
       // list.printList();

        System.out.println();

        list.addLast("list");
        //list.printList();

        System.out.println();

        list.addFirst("This");
        list.printList();
        System.out.println();
        //list.delFirst();
        //list.printList();
        //System.out.println();
        //list.delLast();
        //list.printList();

        //System.out.println(list.getSize());
        // list.reverseIterate();
        // list.printList();
        list.head = list.reverseRecursive(list.head);
        list.printList();

    }
}