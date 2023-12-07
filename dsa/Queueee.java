class Queue {
    private static final int MAX_SIZE = 5;
    private int[] array;
    private int front, rear, size;

    public Queue() {
        this.array = new int[MAX_SIZE];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    // Insertion (enqueue) operation
    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + data);
        } else {
            rear = (rear + 1) % MAX_SIZE;
            array[rear] = data;
            size++;
            System.out.println("Enqueued: " + data);
        }
    }

    // Deletion (dequeue) operation
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
        } else {
            int removedItem = array[front];
            front = (front + 1) % MAX_SIZE;
            size--;
            System.out.println("Dequeued: " + removedItem);
        }
    }

    // Traversing the queue
    public void traverse() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.print("Queue elements: ");
            int count = 0;
            int index = front;

            while (count < size) {
                System.out.print(array[index] + " ");
                index = (index + 1) % MAX_SIZE;
                count++;
            }
            System.out.println();
        }
    }

    // Check if the queue is full
    private boolean isFull() {
        return size == MAX_SIZE;
    }

    // Check if the queue is empty
    private boolean isEmpty() {
        return size == 0;
    }
}

public class Queueee {
    public static void main(String[] args) {
        Queue queue = new Queue();

        // Insertion operations
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        // Traversing the queue
        queue.traverse();

        // Deletion operations
        queue.dequeue();
        queue.dequeue();

        // Traversing the queue after deletions
        queue.traverse();
    }
}
