import java.util.Scanner;

public class Asgn2_1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int a = sc.nextInt();
		System.out.println("Given number : " + a );
		System.out.println("Binary equivalent :" + Integer.toBinaryString(a));
		System.out.println("Octal equivalent :" + Integer.toOctalString(a));
		System.out.println("Hexadecimal equivalent :" + Integer.toHexString(a));
	}

}
