import java.util.Scanner;

public class number4{

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value: ");
	
		int a = sc.nextInt();
		int b=1;

		for(int i=1;i<=a;i++)
		{
		for(int j=1;j<=i;j++)
		{
			System.out.print(b+" ");
			b++;
		}
		System.out.println();
	  }
	}
}
/*
 * enter the value:5
 OUTPUT
   1
   2 3
   4 5 6
   7 8 9 10
 
 */

