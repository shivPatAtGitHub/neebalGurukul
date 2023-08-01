package assignmentDay9;



public class RecursionAssign5 {
	static int CamC(String x, int n) {
		if(n==0)
			return 1;
		 
		if(Character.isUpperCase(x.charAt(n)))
				return 1 + CamC(x, n-1);		
		 else
			return CamC(x, n-1);
		
		
	}
		

	public static void main(String[] args) {
		String a = "thisIsACamelCase";
		int len = a.length()-1; 
//		System.out.println(len);
		int count = CamC(a, len);
		
		
		
		System.out.println(count);
		
		
	}

}
