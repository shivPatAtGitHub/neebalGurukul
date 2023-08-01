package assignmentsDay8;

public class Q16 {

	public static void main(String[] args) {
		String a = "Never odd or even";
		a = a.toUpperCase();
		
		
		String arr[] = a.split("[\\W]");
		
		String x = "";
		
		for(int i=0; i<arr.length; i++) {
			x = x+arr[i];
		}
		
		System.out.println(x);
		
		int len = x.length();
		
		boolean flag = true;
		for(int i=0, j=len-1; i<len/2; i++, j--) {
			
			char c = x.charAt(i);
			char c1 = x.charAt(j);
			
			if(c != c1) {
				flag = false;
				break;
			}
			
		}
		
		if (flag == false) {
			System.out.println("not a palindrome");				
		} else {
			System.out.println("palindrome");							
		}
		
		
	}

}
