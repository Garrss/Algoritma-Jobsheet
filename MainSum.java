import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("============================================");
        System.out.println("Program for Calculating Total Profits");
        System.out.println("Input how many company you want to calculate : ");
        int companyCount = sc.nextInt();
        Sum[] sm = new Sum[companyCount];

        System.out.println("=====================================================");
        System.out.print("Input the number of month : ");
        int totElemn = sc.nextInt();

        for (int i = 0; i < companyCount; i++) {
            sm[i] = new Sum(totElemn);
        }

        System.out.println("=====================================================");
        for (int i = 0; i < sm.length; i++) {
            System.out.println("Company " + (i + 1));
            for (int j = 0; j < sm[0].elemen; j++) {
                System.out.println("Input the profit of the month to - " + (i + 1) + " = ");
                sm[i].profit[j] = sc.nextDouble();
            }
        }

        System.out.println("=====================================================");
        System.out.println("Algorithm brute force");
        for (int i = 0; i < sm.length; i++) {
            System.out.println("Total profits of company " + (i + 1) + " for " + sm[i].elemen + " month is = "
                    + sm[i].totalBF(sm[i].profit));
        }

        System.out.println("=====================================================");
        System.out.println("Algorithm divide and conquer");
        for (int i = 0; i < sm.length; i++) {
            System.out.println("Total profits of company " + (i + 1) + " for " + sm[i].elemen + " month is = "
                    + sm[i].totalDC(sm[i].profit, 0, sm[i].elemen - 1));
        }

    }
}
