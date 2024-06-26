package Jobsheet11;

public class SLLMain {
    public static void main(String[] args) {
        SingleLinkedList singLL = new SingleLinkedList();

        singLL.print();
        singLL.addfirst(890);
        singLL.print();
        singLL.addlast(760);
        singLL.print();
        singLL.addfirst(700);
        singLL.print();
        singLL.insertAfter(700, 999);
        singLL.print();
        singLL.insertAt(3, 833);
        singLL.print();
        System.out.println("Data in 1st index: " + singLL.getData(1));
        System.out.println("Data 3 is in index: " + singLL.indexOf(760));
        singLL.remove(999);
        singLL.print();
        singLL.removeAt(0);
        singLL.print();
        singLL.removeFirst();
        singLL.print();
        singLL.removeLast();
        singLL.print();
    }

}
