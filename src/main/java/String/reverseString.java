package String;

public class reverseString{
	
	
	public static void main (String[] args) {
		
		
		String str = "Testing";
        char chars[] = str.toCharArray();  // converted to character array and printed in reverse order
        for(int i= chars.length-1; i>=0; i--) {
            System.out.print(chars[i]);
           // System.out.print("Hello");
		
        }
        }
	}
	
	
	

