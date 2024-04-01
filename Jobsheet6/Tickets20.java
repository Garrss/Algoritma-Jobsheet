package Jobsheet6;

public class Tickets20 {
    String airlines, destination, origin;
    int price;

    Tickets20(String a, String dest, String origin, int price) {
        this.airlines = a;
        this.destination = dest;
        this.origin = origin;
        this.price = price;
    }

    void print() {
        System.out.printf("%-30s | %-40s | %-30s | %-10s%n", airlines, destination, origin, price);
    }
}
