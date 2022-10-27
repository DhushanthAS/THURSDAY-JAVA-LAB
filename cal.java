import java.util.Scanner;
public class cal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the 4 digit number ");
		  int num = sc.nextInt();
		  float i = (((num+8)/3)%5)*5;
		  sc.close();
		  System.out.println("The Result is "+i);
		}

}
