package UAS;

import java.util.Scanner;

public class Main {
    private static DoubleLinkedList vehicles = new DoubleLinkedList();
    private static DoubleLinkedList transactions = new DoubleLinkedList();
    private static int transactionCount = 0;

    public static void main(String[] args) {
        initializeVehicles();
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        while (option != 5) {
            System.out.println("Menu");
            System.out.println("1. Vehicle List");
            System.out.println("2. Tax Payment");
            System.out.println("3. Print All Transactions");
            System.out.println("4. Sort Transactions by Owner Name");
            System.out.println("5. Exit");
            System.out.print("Your Option (1-5): ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    vehicles.printList();
                    break;
                case 2:
                    taxPayment(scanner);
                    break;
                case 3:
                    printAllTransactions();
                    break;
                case 4:
                    sortTransactionsByOwnerName();
                    break;
                case 5:
                    System.out.println("Exiting the Program!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
    }

    private static void initializeVehicles() {
        vehicles.add(new Vehicle("S 4567 YV", "Basko", "Mobil", 2000, 2012, 4));
        vehicles.add(new Vehicle("N 4511 VS", "Arta", "Mobil", 2500, 2015, 3));
        vehicles.add(new Vehicle("AB 4321 A", "Wisnu", "Motor", 125, 2010, 2));
        vehicles.add(new Vehicle("B 1234 AG", "Sisa", "Motor", 150, 2020, 1));
    }

    private static void taxPayment(Scanner scanner) {
        System.out.print("Input your vehicle reg number: ");
        String regNumber = scanner.nextLine();
        System.out.print("Month to pay: ");
        int monthToPay = scanner.nextInt();

        Vehicle vehicle = vehicles.find(regNumber);
        if (vehicle == null) {
            System.out.println("Vehicle not found!");
            return;
        }

        long nominal = calculateNominal(vehicle);
        long penalty = calculatePenalty(vehicle.getMonthToPay(), monthToPay);
        TaxTransaction transaction = new TaxTransaction(nominal, penalty, monthToPay, vehicle);
        transactions.add(transaction.getVehicle());

        System.out.println("Transaction Successful!");
        System.out.printf("Code: %d | Vehicle Reg Number: %s | Name: %s | Nominal: %d | Penalty: %d%n",
                transaction.getCode(), vehicle.getRegNumber(), vehicle.getName(), nominal, penalty);
    }

    private static long calculateNominal(Vehicle vehicle) {
        if (vehicle.getType().equalsIgnoreCase("Motor")) {
            if (vehicle.getCc() < 100) {
                return 100000;
            } else if (vehicle.getCc() <= 250) {
                return 250000;
            } else {
                return 500000;
            }
        } else if (vehicle.getType().equalsIgnoreCase("Mobil")) {
            if (vehicle.getCc() < 1000) {
                return 750000;
            } else if (vehicle.getCc() <= 2500) {
                return 1000000;
            } else {
                return 1500000;
            }
        }
        return 0;
    }

    private static long calculatePenalty(int monthToPay, int currentMonth) {
        int monthsLate = currentMonth - monthToPay;
        if (monthsLate > 0 && monthsLate <= 3) {
            return 50000;
        } else if (monthsLate > 3) {
            return 50000 * (monthsLate - 2);
        }
        return 0;
    }

    static void printAllTransactions() {
        Node current = transactions.head;
        System.out.println("Tax Payment Transaction List");
        System.out.println("-------------------------------------------------");
        System.out.println("Code | Vehicle Reg Number | Name | Nominal | Penalty");
        long totalIncome = 0;
        while (current != null) {
            Vehicle vehicle = current.vehicle;
            System.out.printf("%d | %s | %s | %d | %d%n",
                    vehicle.getRegNumber(),
                    vehicle.getName(),
                    calculateNominal(vehicle),
                    calculatePenalty(vehicle.getMonthToPay(), vehicle.getMonthToPay())); // Example calculation
            totalIncome += calculateNominal(vehicle)
                    + calculatePenalty(vehicle.getMonthToPay(), vehicle.getMonthToPay());
            current = current.next;
        }
        System.out.println("-------------------------------------------------");
        System.out.println("Total Income: " + totalIncome);
    }

    private static void sortTransactionsByOwnerName() {
        if (transactions.head == null)
            return;
        boolean swapped;
        do {
            swapped = false;
            Node current = transactions.head;
            while (current.next != null) {
                if (current.vehicle.getName().compareTo(current.next.vehicle.getName()) > 0) {
                    Vehicle temp = current.vehicle;
                    current.vehicle = current.next.vehicle;
                    current.next.vehicle = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
        printAllTransactions();
    }
}