import java.util.Scanner;

public class Task {
    public static String convertIntegerToBinaryStringWithAddedBits(int decimalNumber) {
        String c = Integer.toBinaryString(decimalNumber);
        String s = "";
        for (int i = 0; i < (8 - c.length()); i++) {
            s += "0";
        }
        s = s + c;
        return s;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int decimalNumber = s.nextInt();
        String res = convertIntegerToBinaryStringWithAddedBits(decimalNumber);
        System.out.println(res);
    }
}