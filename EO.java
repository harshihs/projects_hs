import java.util.Scanner;

public class EO {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  value");
		int a = sc.nextInt();
		if (a % 2 != 0) 

			System.out.println("it is a odd number");
		 else
			System.out.println("it is a even number");
	}
}

    
