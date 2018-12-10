package Learning;


public class FibonacciSeries {

	public static void main(String[] args) {
		

		int i=1;
		int j=2;
		int count=10;
		int z;
		
		
		System.out.print(i + " " + j);
		
		
		for(int c=2;c<count;c++){
			z=i+j;
			
			System.out.print(" "+z);
			i=j;
			j=z;
			
		}
		
		
	}
}
