import java.util.Scanner;

public class Task {
	public char asciiToChar(int ascii) {
		return (char) ascii;
	}

	public void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		char b = asciiToChar(n);
		System.out.println(b);
	}
}