import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("===================================================");
        System.out.print("Input the number of elemente you want to count : ");

        int elemen = sc.nextInt();

        Faktorial[] fk = new Faktorial[elemen];
        for (int i = 0; i < elemen; i++) {
            fk[i] = new Faktorial();
            System.out.print("Input the data value to-" + (i + 1) + " : ");
            fk[i].num = sc.nextInt();
        }

        System.out.println("==================================================");
        System.out.println("Factorial Results with Brute Force");
        for (int i = 0; i < fk.length; i++) {
            Long startBF = System.nanoTime();
            System.out.println("Factorial of Value " + fk[i].num + " is : " + fk[i].FaktorialBF(fk[i].num));
            long endBF = System.nanoTime();
            long timeBF = endBF - startBF;
            System.out.println("Time : " + timeBF + " ns");
        }

        System.out.println("==================================================");
        System.out.println("Factorial Results with Divide and Conquer");
        for (int i = 0; i < fk.length; i++) {
            long startDC = System.nanoTime();
            System.out.println("Factorial of value " + fk[i].num + " is : " + fk[i].FaktorialDC(fk[i].num));
            long endDC = System.nanoTime();
            long timeDc = endDC - startDC;
            System.out.println("Time : " + timeDc + " ns");
        }

        System.out.println("==================================================");
    }
}
