public class Sphere {
    int radius;

    Sphere(int radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    double calculateVolume() {
        return (4 * Math.PI * Math.pow(radius, 3)) / 3;

    }
}
