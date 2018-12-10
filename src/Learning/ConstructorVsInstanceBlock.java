package Learning;


public class ConstructorVsInstanceBlock {
	
	private int a;
	private static int count;
	
	
	public ConstructorVsInstanceBlock(int a) {
		this();
		this.a=a;
		System.out.println("This is no-arg Constructor "+this.a);
	}
	
	public ConstructorVsInstanceBlock() {
		
		System.out.println("This is default Constructor");
	}
	
	{
		count++;
		
	}
	
	public static void main(String[] args){
		
		ConstructorVsInstanceBlock obj = new ConstructorVsInstanceBlock(1);
	
		ConstructorVsInstanceBlock obj1 = new ConstructorVsInstanceBlock(2);
		ConstructorVsInstanceBlock obj2 = new ConstructorVsInstanceBlock(2);
		ConstructorVsInstanceBlock obj3 = new ConstructorVsInstanceBlock(2);
		ConstructorVsInstanceBlock obj4 = new ConstructorVsInstanceBlock(2);
		
		System.out.println(count);
	}

}
