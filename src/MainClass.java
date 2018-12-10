

public class MainClass {
	
	static{
		System.out.println("First static block");
		//System.exit(0);
	}
	
	public static void main(String[] args){
		System.out.println("String[]");
		MainClass.main(new int[]{1,2,3,4,5});
		System.out.println(args.length);
	}
	
	public static void main(int[] args){
		System.out.println("int[] arg"); 
	}

}
