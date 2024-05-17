package Jobsheet8;

import java.util.Scanner;

public class Bookmain {
    public static void main(String[] args) {
        Bookstack st = new Bookstack(8);
        Scanner sc = new Scanner(System.in);

        char choose;
        do {
            System.out.print("Title : ");
            String title = sc.nextLine();

            System.out.print("Author Name : ");
            String authorName = sc.nextLine();

            System.out.print("Published Year: ");
            int year = sc.nextInt();

            System.out.print("Pages Amount: ");
            int pages = sc.nextInt();

            System.out.print("Prices: ");
            int price = sc.nextInt();

            Book bk = new Book(title, authorName, year, pages, price);
            System.out.print("Do you want to add new data to stack (y/n)?");
            choose = sc.next().charAt(0);
            sc.nextLine();
            st.push(bk);

        } while (choose == 'y');

        st.print();
        st.pop();
        st.peek();
        st.print();
    }
}