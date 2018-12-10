

public class ParentA {
	
	
	 int a = 10;
	
	ParentA(int a){
		System.out.println("This is Parent Constructor "+a);
	}
	
	public void m1(){
		System.out.println("This is parent method m1");
	}
	
	public void m1(int a){
		System.out.println("This is overloaded parent method m1"+a);
	}
	
	public void m2(double d){
		System.out.println("This is double parent method m2"+d);
	}

	public static void m3(){
		System.out.println("This is static parent method");
	}
	
	public Object m4(StringBuffer s){
		return s;
	}
}
