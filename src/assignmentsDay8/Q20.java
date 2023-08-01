package assignmentsDay8;

public class Q20 {

	public static void main(String[] args) {
		String a = "camelCase";
		
		String x[] = a.split(" ");
		
		String b = "";
		
		for(int i=0; i<x.length; i++) {
			b = (Character.toUpperCase(x[i].charAt(0))) + x[i].substring(1);
			x[i] = b;
		}

		System.out.println(b);
		
		for(int i=0; i < x.length; i++) {
			System.out.print(x[i] + " ");		
		}
		
	}

}
