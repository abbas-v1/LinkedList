package net.bitoasis.app;

public class Main {

    public static void main(String[] args) {
        Node node1 = new Node(1);

        Node node2 = new Node(2);
        node1.setNext(node2);

        Node node3 = new Node(3);
        node2.setNext(node3);

        Node node4 = new Node(4);
        node3.setNext(node4);

        Node node5 = new Node(5);
        node4.setNext(node5);

        printForward(node1);
        System.out.println("");

        printReverse(node1);
        System.out.println("");

        Node lastNode = reverseLinkedList(node1);
        printForward(lastNode);

    }

    static void printForward(Node node) {
        while (node != null) {
            System.out.println(node.getValue());
            node = node.getNext();
        }
    }

    static void printReverse(Node node) {
        if (node.getNext() != null) {
            printReverse(node.getNext());
        }

        System.out.println(node.getValue());
    }

    static Node reverseLinkedList(Node current) {

        Node prevsious = null;

        while (current != null) {
            Node next = current.getNext();
            current.setNext(prevsious);
            prevsious = current;
            current = next;
        }

        return prevsious;
    }

    private static class Node {

        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

    }

}
