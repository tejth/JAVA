class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Insertion at the beginning
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insertion at the last
    void insertAtLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Insertion at any location
    void insertAtLocation(int data, int position) {
        Node newNode = new Node(data);

        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        for (int i = 0; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position. Insertion not possible.");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Display the linked list
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class SLinkedlist {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        // Insertion at the beginning
        linkedList.insertAtBeginning(3);
        linkedList.insertAtBeginning(2);
        linkedList.insertAtBeginning(1);

        // Display the linked list
        System.out.println("Linked List after insertion at the beginning:");
        linkedList.display();

        // Insertion at the last
        linkedList.insertAtLast(4);
        linkedList.insertAtLast(5);

        // Display the linked list
        System.out.println("Linked List after insertion at the last:");
        linkedList.display();

        // Insertion at any location
        linkedList.insertAtLocation(10, 2);

        // Display the linked list
        System.out.println("Linked List after insertion at position 2:");
        linkedList.display();
    }
}
