import java.util.Scanner;

import static java.lang.Math.pow;
public class Task {
    public static double calculateAreaOfTriangleWith3Sides(double side1, double side2, double side3) {
        double sum = side1 + side2 + side3;
        sum = sum / 2;
        double res;
        res = pow((sum * (sum - side3) * (sum - side1) * (sum - side2)), 0.5);
        return res;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double side1 = s.nextDouble();
        double side2 = s.nextDouble();
        double side3 = s.nextDouble();
        double res = calculateAreaOfTriangleWith3Sides(side1, side2, side3);
        System.out.println(res);
    }
}