public class Task {
    public double maximumOfThreeNumbers(double n1, double n2, double n3) {
        if ((n1 > n2) && (n1 > n3)) {
            return n1;
        } else if ((n2 > n1) && (n2 > n3)) {
            return n2;
        } else {
            return n3;
        }
    }
}