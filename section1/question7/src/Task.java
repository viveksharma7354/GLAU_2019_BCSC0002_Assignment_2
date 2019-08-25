public class Task {
    public static void main(String[] args) {
        int res = (int) evaluateExpression();
        System.out.println(res);
    }

    public static double evaluateExpression() {
        int x = (4 * 10) + 5 * 3 * (4 + 2) + 10;
        return (double) x;
    }
}