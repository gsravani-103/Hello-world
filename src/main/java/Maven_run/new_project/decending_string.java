package Maven_run.new_project;

import java.util.Arrays;

public class decending_string {

	public static void main(String[] args) {

			  
	
	        String s = "geeksforgeeks";
	        sortString(s);
	}
	    
	    static void sortString(String str) {
	        char []arr = str.toCharArray();
	        Arrays.sort(arr);
	        System.out.print(String.valueOf(arr));
	    

	
	}

}
