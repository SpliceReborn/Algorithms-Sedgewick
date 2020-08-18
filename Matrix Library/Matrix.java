import java.util.Vector;

public class Matrix {
    public static double dot(double[] x, double[] y) {
        double sum = 0;
        
        if (x.length != y.length) return 0;
        else {
            int length = x.length;
            for (int i=0; i<length; i++) {
                double temp = x[i] * y[i];
                sum += temp;
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        double[] vector1 = {3,2,5,7,9};
        double[] vector2 = {4,1,3,-5,6.6};
        System.out.println(dot(vector1,vector2));
    }
}
