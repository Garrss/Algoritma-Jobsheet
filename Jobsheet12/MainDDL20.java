package Jobsheet12;

public class MainDDL20 {
    public static void main(String[] args) {
        DoubleLinkedList20 DLL = new DoubleLinkedList20();
        DLL.print();
        System.out.println("Size : " + DLL.size());
        System.out.println("==============================");
        DLL.addfirst(3);
        DLL.addlast(4);
        DLL.addfirst(7);
        DLL.print();
        System.out.println("Size : " + DLL.size());
        System.out.println("================================");
        DLL.add(40, 1);
        DLL.print();
        System.out.println("Size : " + DLL.size());
        System.out.println("=================================");
        DLL.clear();
        DLL.print();
        System.out.println("Size : " + DLL.size());

        DLL.addlast(50);
        DLL.addlast(40);
        DLL.addlast(10);
        DLL.addlast(20);
        DLL.print();
        System.out.println("Size : " + DLL.size());
        System.out.println("==================================");
        DLL.removeFirst();
        DLL.print();
        System.out.println("Size : " + DLL.size());
        System.out.println("==================================");
        DLL.removeLast();
        DLL.print();
        System.out.println("Size : " + DLL.size());
        System.out.println("==================================");
        DLL.remove(1);
        DLL.print();
        System.out.println("Size : " + DLL.size());
        DLL.clear();

        DLL.print();
        System.out.println("Size : " + DLL.size());
        System.out.println("==================================");
        DLL.addfirst(3);
        DLL.addlast(4);
        DLL.addfirst(7);
        DLL.print();
        System.out.println("Size : " + DLL.size());
        System.out.println("==================================");
        DLL.add(40, 1);
        DLL.print();
        System.out.println("Size : " + DLL.size());
        System.out.println("==================================");
        System.out.println("Data in the head of linked list is : " + DLL.getFirst());
        System.out.println("Data in the tail of linked list is : " + DLL.getLast(0));
        System.out.println("Data in the 1st index linked list is : " + DLL.get(1));
    }

}
