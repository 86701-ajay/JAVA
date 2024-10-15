import java.util.Scanner;

public class Asgn2_2 {
	
	static int menu() {
		System.out.println("Menu");
		System.out.println("--------------");
		System.out.println("0.EXIT");
		System.out.println("1.Dosa (50)");
		System.out.println("2.Idli (25)");
		System.out.println("3.Samosa (15)");
		System.out.println("4.Biryani (150)");
		System.out.println("5.Cake (210)");
		System.out.println("6.Total Bill");
		System.out.println("--------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your choice : ");
		int res = sc.nextInt();
		return res;
	}

	public static void main(String[] args) {
		int res;
		int count = 0;
		int quantity = 1;
		Scanner sc = new Scanner(System.in);
		while( (res = menu()) != 0) {
			switch (res) {
			case 1:
				
				System.out.println("Dosa : 50");
				System.out.print("Enter quantity : ");
				quantity = sc.nextInt();
				count = count + (50 * quantity);
				break;
				
			case 2:
				System.out.println("Idli : 25");
				System.out.print("Enter quantity : ");
				quantity = sc.nextInt();
				count = count +(25 * quantity);
				break;
				
			case 3:
				System.out.println("Samosa : 15");
				System.out.print("Enter quantity : ");
				quantity = sc.nextInt();
				count = count + (15 * quantity);
				break;
				
			case 4:
				System.out.println("Biryani : 150");
				System.out.print("Enter quantity : ");
				quantity = sc.nextInt();
				count = count + (150 * quantity);
				break;
				
			case 5:
				System.out.println("Cake : 210");
				System.out.print("Enter quantity : ");
				quantity = sc.nextInt();
				count = count + (210 * quantity);
				break;
				
			case 6:
				System.out.println("Total Bill : "+count);
				break;

			default:
				System.out.println("Please Enter valid Input !!!");
				break;
			}
		}
		System.out.println("Come Visit Soon ... :)");
	}
}
