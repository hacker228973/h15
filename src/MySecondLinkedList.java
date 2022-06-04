public class MySecondLinkedList {
    public Node first;

    private boolean indexCheck(int index) {

        return index >= size || index < 0;
    }

    public MySecondLinkedList() {
        first = null;
    }

    private class Node {
        public Integer element;
        public Node next;

        public Node(int element, Node next) {
            this.element = element;
            this.next = next;
        }

        @Override
        public String toString() {
            return
                    "element=" + element +
                            ", next=" + next +
                            '}';
        }
    }

    private int size;
    private Node last;


    private Node node(int index) {
        Node node = first;
        for (int i = 0; i < index; i++)
            node = node.next;
        return node;
    }

    public void add(int element) {
        Node newNode = new Node(element, null);
        Node currentNode = first;
        if (first == null) {
            first = newNode;
            size++;
        } else {
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
            last = new Node(element, null);
            size++;
        }
    }

    public void add(int index, int element) {
        if (indexCheck(index)) {
            System.out.println("No No No No No No Listen Listen");
            return;
        }
        if (index == size - 1) {
            add(element);
            return;
        }
        if (index == 0) {
            addFirst(element);
            return;
        }
        node(index - 1).next = new Node(element, node(index));
        size++;

    }

    public void addFirst(int element) {
        if (size == 0) {
            add(element);
            return;
        }
        first = new Node(element, node(0));
        size++;
    }

    public void remove(int index) {
        if (indexCheck(index)) {
            System.out.println("No No No No No No Listen Listen");
            return;
        }
        if (node(index) == last) {
            node(index - 1).next = null;
            last = node(index - 1);
            return;
        }

        node(index - 1).next = node(index).next;
        size--;
    }

    public void set(int index, int element) {
        if (indexCheck(index)) {
            System.out.println("No No No No No No Listen Listen");
            return;
        }

        node(index).element = element;
    }

    public int get(int index) {
        if (size == 0) {
            System.out.println("No No No No No No Listen Listen");
            return 0;
        }

        if (indexCheck(index)) {
            System.out.print("No No No No No No Listen Listen");
            return 0;
        }

        return node(index).element;

    }

    public void removeByElement(int element) {
        Node currentNode = first;
        Node previousNode = null;
        while (currentNode != null) {
            if (currentNode.element == element) {
                if (currentNode == first) {
                    first = currentNode.next;
                } else {
                    previousNode.next = currentNode.next;
                }
            }

            previousNode = currentNode;
            currentNode = currentNode.next;
        }
    }

    public void print() {

        Node currentNode = first;
        if (first != null) {
            System.out.println(first.element);
        }
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            System.out.println(currentNode.element);
        }
    }

    @Override
    public String toString() {
        Node currentNode = first;
        if (first != null) {
            System.out.println(first.element);
        }
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            System.out.println(currentNode.element);
        }
        return "";
    }
}
