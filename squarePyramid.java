public class squarePyramid {
    int side, height;

    squarePyramid(int a, int b) {
        side = a;
        height = b;
    }

    int calculateArea() {
        return side * side;
    }

    double calculateVolume(int area) {
        return area * height / 3;

    }
}