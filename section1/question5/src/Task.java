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

}