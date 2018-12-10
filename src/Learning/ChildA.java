package Learning;


public class ChildA extends ParentA {
	
	int a = 9;
	
	ChildA(){
		super(1);
		System.out.println("This is Child Constructor");
	}
	
	public void m1(){
		System.out.println("This is child method m1");
	}
	
	public void m1(int a){
		System.out.println("This is overloaded child method m1"+a);
	}
	
	public void m2(double d){
		System.out.println("This is double child method m2"+d);
		System.out.println(super.a);
	}

	public static void m3(){
		System.out.println("This is static child method");

	}

	
	public StringBuffer m4(StringBuffer s){
		return s;
	}
	
	
	public static void main(String[] args){
		ParentA objParent = new ChildA();
		objParent.m1();
		objParent.m1(12);
		objParent.m2(2.3);
		System.out.println(objParent.a);
		objParent.m3();
		System.out.println(objParent.m4(new StringBuffer("Rahul")));
		ChildA objChild = new ChildA();
		objChild.m3();
	}
}
