package Jobsheet11;

public class Node03 {
    String data;
    Node03 next;

    static Node03 createNode(String data) {
        Node03 node = new Node03();
        node.data = data;
        node.next = null;
        return node;
    }
}
