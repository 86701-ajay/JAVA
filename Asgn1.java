import java.util.Scanner;

public class Asgn1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter two numbers : ");
		
		if(sc.hasNextDouble() && sc.hasNextInt() == false) {
			double a = sc.nextDouble();
			
			if(sc.hasNextDouble() && sc.hasNextInt() == false) {
			double b = sc.nextDouble();
			System.out.println("a = "+a);
			System.out.println("b = "+b);
			System.out.println("Avg = "+(a+b)/2);
			}
			else {
				System.out.println("Error : 2nd number is not double ");
			}
		}
		else {
			System.out.println("Error : 1st number is not double ");
		}

	}

}
