

public class StringBuffer123 {
	
	static StringBuffer sb = new StringBuffer(1000);
	
	strictfp synchronized final static public void main(String[] args){
		
		System.out.println(sb.capacity());
		sb.append("Rahul");
		System.out.println(sb.length());
		//sb.trimToSize();
		System.out.println(sb.capacity());
		System.out.println(sb.toString());
		System.out.println(sb.reverse());
	}

}
