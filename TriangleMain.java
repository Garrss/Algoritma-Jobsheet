public class TriangleMain {
    public static void main(String[] args) {
        Triangle[] t = new Triangle[4];

        for (int i = 0; i < t.length; i++) {
            t[i] = new Triangle(0, 0);
        }

        t[0].base = 10;
        t[0].height = 4;

        t[1].base = 20;
        t[1].height = 10;

        t[2].base = 15;
        t[2].height = 6;

        t[3].base = 25;
        t[3].height = 10;

        for (int i = 0; i < t.length; i++) {
            System.out.println("Area of triangle " + i + " is: " + t[i].countArea());
            System.out.println("Perimeter of triangle " + i + " is: " + t[i].countPerimeter());
        }
    }
}