

public class MyIntegerLinkedList {
    private Node head;

    public MyIntegerLinkedList() {
        head = null;
    }

    private class Node {
        public Integer element;
        public Node next;

        public Node(int element) {
            this.element = element;
            next = null;
        }

    }

    public void add(int element) {
        Node newNode = new Node(element);
        Node currentNode = head;
        if (head == null) {
            head = newNode;
        } else {
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }


    public void remove(int element) {
        Node currentNode = head;
        Node previousNode = null;
        while (currentNode != null) {
            if (currentNode.element == element) {
                if (currentNode == head) {
                    head = currentNode.next;
                } else {
                    previousNode.next = currentNode.next;
                }
            }

            previousNode = currentNode;
            currentNode = currentNode.next;
        }
    }

    @Override
    public String toString() {
        Node currentNode = head;
        if (head != null) {
            System.out.println(head.element);
        }
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            System.out.println(currentNode.element);
        }
        return "";
    }


}
