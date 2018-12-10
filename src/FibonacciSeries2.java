

public class FibonacciSeries2 {

	public static void main(String[] args) {
		
		int i=1,j=2,c,count=10;
		
		System.out.print(i + " " +  j);
		
		for(int d=2;j<count;d++){
			
		c=i+j;
		System.out.print(" "+c);
		
		i=j;
		j=c;
		}

	}

}
