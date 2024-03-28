import java.util.Scanner;

public class calculatemain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Sphere[] sphere = new Sphere[3];
        squarePyramid[] pyr = new squarePyramid[3];

        for (int i = 0; i < pyr.length; i++) {
            System.out.print("Input base " + i + ": ");
            int base = in.nextInt();

            System.out.print("Input height " + i + ": ");
            int height = in.nextInt();

            pyr[i] = new squarePyramid(base, height);
        }

        for (int i = 0; i < sphere.length; i++) {
            System.out.println("Input radius " + i + ": ");
            int radius = in.nextInt();

            sphere[i] = new Sphere(radius);
        }

        for (int i = 0; i < pyr.length; i++) {
            System.out.println("Area of square pyramid " + i + ": " + pyr[i].calculateArea());
            System.out.println("Volume of square pyramid " + i + ": " + pyr[i].calculateVolume(pyr[i].calculateArea()));
            System.out.println();

            System.out.println("Area of sphere " + i + ": " + sphere[i].calculateArea());
            System.out.println("Volume of sphere " + i + ": " + sphere[i].calculateVolume());
            System.out.println();
        }
    }
}
