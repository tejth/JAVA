class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    // Insertion at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insertion at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Deletion at the beginning
    public void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty. Deletion not possible.");
            return;
        }
        head = head.next;
    }

    // Deletion at the end
    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty. Deletion not possible.");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    // Deletion at any location
    public void deleteAtLocation(int position) {
        if (head == null) {
            System.out.println("List is empty. Deletion not possible.");
            return;
        }
        if (position == 1) {
            head = head.next;
            return;
        }
        Node current = head;
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null || current.next == null) {
            System.out.println("Invalid position. Deletion not possible.");
            return;
        }
        current.next = current.next.next;
    }

    // Display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class S2LinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        System.out.println("Original linked list:");
        list.display();

        // Deletion at the beginning
        list.deleteAtBeginning();
        System.out.println("Linked list after deletion at the beginning:");
        list.display();

        // Deletion at the end
        list.deleteAtEnd();
        System.out.println("Linked list after deletion at the end:");
        list.display();

        // Deletion at any location (position 1 in this case)
        list.deleteAtLocation(1);
        System.out.println("Linked list after deletion at position 1:");
        list.display();
    }
}
