

public class SingelontonClassParent {

	SingelontonClassParent(){
		super();
	}

	static SingelontonClassParent obj = null;

	int a = 10;
	int b = 20;

	public static SingelontonClassParent getObject(){

		if(obj==null){
			obj = new SingelontonClassParent();
		}
		return obj;
	}


}



