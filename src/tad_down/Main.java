package tad_down;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insertOrdered(30);
        list.insertOrdered(10);
        list.insertOrdered(20);
        list.insertOrdered(40);

        list.printForward();  // Esperado: 10 20 30 40
        list.printBackward(); // Esperado: 40 30 20 10

        list.remove(20);
        list.printForward();  // Esperado: 10 30 40
        list.printBackward(); // Esperado: 40 30 10
    }
}
