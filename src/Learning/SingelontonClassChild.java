package Learning;

public class SingelontonClassChild {
	
	SingelontonClassChild(){
		
	}
	
	public static void main(String[] args){
		
		SingelontonClassParent obj = SingelontonClassParent.getObject();
		SingelontonClassParent obj1 = SingelontonClassParent.getObject();
		
		System.out.println(obj.a);
		System.out.println(obj1.a);
		
		
	}
	
	
		}
	
	
