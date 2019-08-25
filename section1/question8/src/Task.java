public class Task {
    public static void main(String[] args) {
        Task task = new Task();
        String sb = "";
        String stringVal = task.booleanAnd(0, 0);
        int diff = 8 - stringVal.length();
        for (int i = 0; i < diff; i++) {
            sb += "0";
        }
        sb = sb + stringVal;
        System.out.println(sb.toString());
    }

    public String booleanAnd(int number1, int number2) {
        int res = (number1 & number2);
        return Integer.toBinaryString(res);
    }

}