

public class Main {
    public static void main(String[] args) {
//        MyIntegerLinkedList linkedList = new MyIntegerLinkedList();
//        linkedList.add(5);
//        linkedList.add(5);
//        linkedList.add(2);
//        linkedList.add(3);
//        System.out.println("///////////////////");
//
//
//        System.out.print(linkedList);
//        linkedList.remove(5);
//
//
//        System.out.println("///////////////////");
//        System.out.print(linkedList);
        MySecondLinkedList linkedList = new MySecondLinkedList();
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.print();
        System.out.println(linkedList.first);
        System.out.println("//////////////");
        linkedList.add(0,81);
        linkedList.print();
        System.out.println("//////////////");
        linkedList.remove(81);
        linkedList.print();
        System.out.println(linkedList.first);
//        SoninLinkedList linkedList = new SoninLinkedList();
//        linkedList.add(5);
//        linkedList.add(2);
//        linkedList.add(6);
//        linkedList.add(3);
//        linkedList.add(1,83);
//        System.out.println(linkedList);
    }
}
