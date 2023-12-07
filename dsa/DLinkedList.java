class DoublyLinkedList {
    class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
    private Node head;

    public DoublyLinkedList() {
        this.head = null;
    }

    // Insertion at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Traversing the doubly linked list
    public void traverse() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}


public class DLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        // Insertion at the beginning
        doublyLinkedList.insertAtBeginning(30);
        doublyLinkedList.insertAtBeginning(20);
        doublyLinkedList.insertAtBeginning(10);

        System.out.println("Doubly linked list after insertion at the beginning:");
        doublyLinkedList.traverse();
    }
}
