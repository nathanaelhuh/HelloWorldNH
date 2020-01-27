import java.util.Scanner;

public class HelloWorld {
	public static void main (String[] args)
	{
		System.out.println("Enter your name");
		Scanner in = new Scanner(System.in);
		String b;
		b = in.nextLine();
		System.out.println("Hello "+ b);
	}
}