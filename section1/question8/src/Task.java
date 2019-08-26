public class Task {
	public String booleanAnd(int number1, int number2) {
		StringBuilder sb = new StringBuilder();
		int res = (number1 & number2);
		String stringVal = Integer.toBinaryString(res);
		int diff = 8 - stringVal.length();
		for (int i = 0; i < diff; i++) {
			sb.append(0);
		}
		sb.append(stringVal);
		return sb.toString();
	}
}