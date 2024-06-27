package Jobsheet12.Assignment2;

public class BookNode {
    String title;
    BookNode next;
    BookNode prev;

    public BookNode(String title) {
        this.title = title;
        this.next = null;
        this.prev = null;
    }
}