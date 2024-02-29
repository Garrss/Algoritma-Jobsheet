public class Dragon20 {
    int width, height, x, y;

    public Dragon20(int w, int h) {
        width = w;
        height = h;
        x = w / 2;
        y = h / 2;
    }

    void printPosition() {
        System.out.printf("(%d, %d)", x, y);
        System.out.println();
    }

    void moveleft() {
        if (x > 0)
            x--;
        printPosition();
        detectColission();
    }

    void moveright() {
        if (x < width)
            x++;
        printPosition();
        detectColission();
    }

    void moveup() {
        if (y > 0)
            y--;
        printPosition();
        detectColission();
    }

    void movedown() {
        if (y < height)
            y++;
        printPosition();
        detectColission();
    }

    void detectColission() {
        if (x <= 0 || y <= 0 || x >= width || y >= height)
            System.out.println("Game Over!");
    }

    public static void main(String[] args) {
        Dragon20 p = new Dragon20(50, 100);
        for (int i = 0; i <= 50; i++) {
            p.movedown();
        }
    }
}
