

public class Main {
    public static void main(String[] args) {
        MyIntegerLinkedList linkedList = new MyIntegerLinkedList();
        linkedList.add(5);
        linkedList.add(5);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println("///////////////////");


        System.out.print(linkedList);
        linkedList.remove(5);


        System.out.println("///////////////////");
        System.out.print(linkedList);

    }
}
