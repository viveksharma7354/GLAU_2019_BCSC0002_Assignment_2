public class Task {
	public String booleanAnd(int number1, int number2) {
		String sb = "";
		int res = (number1 & number2);
		String stringVal = Integer.toBinaryString(res);
		int diff = 8 - stringVal.length();
		for (int i = 0; i < diff; i++) {
			sb += "0";
		}
		sb = sb + stringVal;
		return sb;
	}
}