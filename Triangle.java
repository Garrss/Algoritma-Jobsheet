public class Triangle {
    public int base, height;

    public Triangle(int a, int t) {
        base = a;
        height = t;
    }

    double countArea() {
        return 0.5 * base * height;
    }

    double countPerimeter() {
        return 2 * (base + height);
    }
}
