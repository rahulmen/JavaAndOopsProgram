

import java.util.Scanner;

public class Square  {
	
	
final synchronized public static void main(String[] args){
	
	
	Scanner s = new Scanner(System.in);
	System.out.print ("Enter The number: ");
	int n = s.nextInt();
	
	System.out.println("The square of "+n+ " is: "+ (n*n));
	
}

}
