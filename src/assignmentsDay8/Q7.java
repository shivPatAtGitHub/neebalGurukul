package assignmentsDay8;

public class Q7 {

	public static void main(String[] args) {
		String a = "LMN";
		a = a.toUpperCase();
		String c = "";
		int shift = 5;
		
		//to cipher
		System.out.println("Ciphered Text: ");
		for(int i=0; i<a.length(); i++) {
			char b = a.charAt(i);
//			if(b >= 90) {
//				b = (char) (((b) % 26) + 65);
//			}
			b+=shift;
			
			c+=b;
			System.out.print(b);
		}
		
		System.out.println();
		System.out.println();
//		System.out.println(c);
		System.out.println("DeCiphered Text: ");
	
		
//		to decipher
//		for(int i=a.length(); i>0; i--) {
//			char d = c.charAt(c.length() - i);
//			d-=3;
//			System.out.print(d);
//		}
		
		for(int i=0; i<c.length(); i++) {
			char d = c.charAt(i);
			d-=shift;
			System.out.print(d);
		}
	}
}
