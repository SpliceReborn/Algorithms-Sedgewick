public class TryStdOut {
    public static void main(String[] args) { // Print N random values in (lo, hi).
        long N = Long.parseLong(args[0]);
        double lo = Double.parseDouble(args[1]);
        double hi = Double.parseDouble(args[2]);
        for (int i = 0; i < N; i++)
        {
        double x = StdRandom.uniform(lo, hi);
        StdOut.printf("%.2f\n", x);
        }
    }
}
