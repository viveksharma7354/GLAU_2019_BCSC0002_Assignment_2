import java.util.Scanner;
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

    public void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double n1 = s.nextDouble();
        double n2 = s.nextDouble();
        double n3 = s.nextDouble();
        double b = maximumOfThreeNumbers(n1, n2, n3);
        System.out.println(b);
    }
}