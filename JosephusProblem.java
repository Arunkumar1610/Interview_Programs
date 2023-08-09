package interview_Programs;


class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class JosephusProblem {
    public static void main(String[] args) {
        int n = 100; // Number of people

        // Creating a circular linked list
        Node head = new Node(1);
        Node prev = head;
        for (int i = 2; i <= n; i++) {
            prev.next = new Node(i);
            prev = prev.next;
        }
        prev.next = head; // Making it circular

        // Performing the killing process until only one person is left
        Node current = head;
        Node previous = null;
        while (current.next != current) {
            // Killing the next person
            previous = current;
            current = current.next;
            previous.next = current.next;

            // Move to the next person (skip the killed one)
            current = current.next;
        }

        System.out.println("The person who survives at the end is: " + current.data);
    }
}
