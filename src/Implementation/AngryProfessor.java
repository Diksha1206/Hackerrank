package Implementation;

public class AngryProfessor {

	
	 static String angryProfessor(int k, int[] a) {

	        String result = "";
	        int count = 0;
	        for(int i=0;i<a.length;i++){
	            if(a[i] <= 0)
	            {
	                count++;
	            }            
	        }
	        if(count >= k)
	            {
	                result = "NO";
	            }
	            else
	            {
	                result = "YES";
	            }
	        return result;
	    }
	 
	 
	public static void main(String[] args) {		
		
		int arrayStudent[]= {-1,-3,4,2};
		int k=3;
		String result= angryProfessor(k,arrayStudent);
		System.out.println(result);				
	}

}
