import java.util.Scanner;

public class Task {
    public static double calculateCircumference(double radius) {
        double circumference = 2.0 * Math.PI * radius;
        return circumference;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double radius = s.nextDouble();
        double circumference = calculateCircumference(radius);
        System.out.println(circumference);
    }
}