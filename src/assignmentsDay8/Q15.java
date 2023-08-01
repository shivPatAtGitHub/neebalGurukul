package assignmentsDay8;

public class Q15 {

	public static void main(String[] args) {
		String a = "Spaces Should not affect word counting";
		String b = "1 2 3 4 5";
		String c = "OneWord";
		String d = "Hello world";
		String e = "This is a test Sentence";
		String x[] = c.split(" ");
		
		System.out.println("Output:");
		for(int i=x.length-1; i>=0; i--) {
			System.out.print(x[i] + " ");
		}

	}

}
