package Jobsheet6;

import java.util.Scanner;

public class MainTicket20 {
    public static String[] airlines = {
            "Emirates",
            "Japan Airlines",
            "Qantas Airways",
            "Lufthansa",
            "Ethiopian Airlines",
            "LATAM Airlines",
            "Qatar Airways",
            "WestJet Airlines",
            "Air New Zealand",
            "Turkish Airlines"
    };

    public static String[] destinations = {
            "London Heathrow (LHR)",
            "Los Angeles International (LAX)",
            "Singapore Changi (SIN)",
            "New York John F. Kennedy (JFK)",
            "Paris Charles de Gaulle (CDG)",
            "Miami International (MIA)",
            "Bangkok Suvarnabhumi (BKK)",
            "Cancún International (CUN)",
            "Melbourne Tullamarine (MEL)",
            "Berlin Brandenburg (BER)"
    };

    public static String[] origins = {
            "Dubai (DXB)",
            "Tokyo Haneda (HND)",
            "Sydney Kingsford Smith (SYD)",
            "Frankfurt am Main (FRA)",
            "Addis Ababa Bole (ADD)",
            "São Paulo Guarulhos (GRU)",
            "Doha Hamad International (DOH)",
            "Calgary International (YYC)",
            "Auckland (AKL)",
            "Istanbul (IST)"
    };

    public static int[] prices = { 1200, 1500, 600, 900, 1000, 850, 900, 750, 675, 600 };

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        TicketService20 ts = new TicketService20();

        for (int i = 0; i < ts.tickets.length; i++) {
            Tickets20 t = new Tickets20(airlines[i], destinations[i], origins[i], prices[i]);
            ts.add(t);
        }

        System.out.printf("%-30s | %-40s | %-30s | %-10s%n", "Airlines", "Destination", "Origin", "Price (USD)");
        ts.displayAll();

        System.out.print("Choose sorting method - 1. Bubble Sort 2. Selection Sort: ");
        int sortMethod = sc.nextInt();
        System.out.print("Price order - 1. Ascending 2. Descending: ");
        boolean isAscending = sc.nextInt() == 1;

        if (sortMethod == 1) {
            ts.bubbleSort(isAscending);
        } else {
            ts.selectionSort(isAscending);
        }
        ts.displayAll();

    }
}