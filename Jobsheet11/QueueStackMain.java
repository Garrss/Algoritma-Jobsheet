package Jobsheet11;

public class QueueStackMain {
    public static void main(String[] args) {
        Stack.push("Bahasa");
        Stack.push("Android");
        Stack.push("Komputer");
        Stack.push("Basis Data");
        Stack.push("Matematika");
        Stack.push("Algoritma");
        Stack.push("Statistika");
        Stack.push("Multimedia");

        System.out.println("Stack after pushing elements:");
        Stack.display();

        System.out.println("\nPopping two elements from the stack:");
        System.out.println("Popped: " + Stack.pop());
        System.out.println("Popped: " + Stack.pop());

        System.out.println("\nStack after popping elements:");
        Stack.display();
    }
}