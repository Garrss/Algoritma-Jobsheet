package Jobsheet12.Assignment3;

import java.util.Scanner;

public class VaccineMain {
    public static void main(String[] args) {
        VaccineQueue vaccineQueue = new VaccineQueue();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("++++++++++++++++++++++++++");
            System.out.println("Extravaganza Vaccine Queue");
            System.out.println("++++++++++++++++++++++++++");
            System.out.println("1. Add vaccine queue");
            System.out.println("2. Remove vaccine queue");
            System.out.println("3. Display vaccine queue");
            System.out.println("4. Exit");
            System.out.println("++++++++++++++++++++++++++");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Add new vaccine queue\nQueue number: ");
                    int queueNumber = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    vaccineQueue.addQueue(queueNumber, name);
                    break;
                case 2:
                    String vaccinatedPerson = vaccineQueue.removeQueue();
                    if (vaccinatedPerson != null) {
                        System.out.println(vaccinatedPerson + " has been vaccinated");
                    }
                    break;
                case 3:
                    vaccineQueue.displayQueue();
                    break;
                case 4:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}