import java.util.Scanner;
public class Swapping {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number 1");
	int num1=sc.nextInt();
	System.out.println("Enter the number 2");
	int num2=sc.nextInt();
	int temp;
	temp=num1;
	num1=num2;
	num2=temp;
	System.out.println("Number1="+num1);
	System.out.println("Number2="+num2);
		
	
	
}
}
