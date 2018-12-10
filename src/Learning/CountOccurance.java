package Learning;


public class CountOccurance {
	
	
	public static void main(String[] args){
		 int[] arr = {1,32,4,32,432,1,24,3,2,1,2,6,5,7,4,3,5,67,3,3,5,6,3,35,65};
		 
		
		for(int i=0;i<arr.length;i++){
		
			int count=0;
			
			for(int j=i;j<arr.length;j++){
				
				if(arr[i]==arr[j]){
					count++;
			
			
				}
				
				
			}
			System.out.println("Count of occurance of" + arr[i] + " is " + count);
		}
		
		
		
		
	}

}
    