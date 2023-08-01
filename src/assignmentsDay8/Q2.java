package assignmentsDay8;

public class Q2 {

	public static void main(String[] args) {
		String a = "ababababab";
		String x[] = a.split(""); 
		String sub = "ab";
		
		int count = 0;
		
		int i=0;
		while((i = a.indexOf(sub,i))!=-1) {
			count++;
			i++;
		}
		
		
		int b = a.indexOf(sub,0);
		
		
		System.out.println(count);
		System.out.println(b);
		
		
		
	}

}
