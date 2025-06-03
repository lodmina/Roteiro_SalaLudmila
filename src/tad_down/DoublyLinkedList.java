package tad_down;

public class DoublyLinkedList {
    private Node head;

    public DoublyLinkedList() {
        head = null;
    }

    // Inserção em ordem crescente
    public void insertOrdered(int data) {
        Node newNode = new Node(data);
        if (head == null || data < head.data) {
            newNode.next = head;
            if (head != null) {
                head.prev = newNode;
            }
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null && current.next.data >= data) {
                current = current.next;
            }

            newNode.next = current.next;
            if (current.next != null) {
                current.next.prev = newNode;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }

    public void printForward() {
        Node current = head;
        System.out.print("Lista (frente): ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void printBackward() {
        Node current = head;
        while (current != null) {
            current = current.next;
        }
        System.out.print("Lista (trás): ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

    public void remove(int data) {
        Node current = head;

        while (current != null && current.data != data) {
            current = current.next;
        }

        if (current == null) return;

        if (current.prev != null) {
            current.prev.next = current.next;
        } else {
            head = head.next;
        }

        if (current.next != null) {
            current.next.prev = current.prev;
        }

    }
}
