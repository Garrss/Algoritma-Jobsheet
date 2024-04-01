public class Squared {
    public int num, Squared;

    public int squaredBF(int a, int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result = result * a;
        }
        return result;
    }

    public int squaredDC(int a, int n) {
        if (n == 0) {
            return 1;
        } else {
            if (n % 2 == 1) // odd
                return (squaredDC(a, n / 2) * squaredDC(a, n / 2) * a);
            else // even
                return (squaredDC(a, n / 2) * squaredDC(a, n / 2));
        }
    }
}
