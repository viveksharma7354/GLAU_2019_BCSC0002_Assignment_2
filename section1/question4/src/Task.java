import java.util.Scanner;

public class Task {
    public static String convertIntegerToBinaryString(int decimalNumber) {
        String c = Integer.toBinaryString(decimalNumber);
        return c;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int decimalNumber = s.nextInt();
        String res = convertIntegerToBinaryString(decimalNumber);
        System.out.println(res);
    }
}