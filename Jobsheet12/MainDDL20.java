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

    }

}
