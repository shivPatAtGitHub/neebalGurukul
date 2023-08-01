package assignmentsDay8;

import java.util.regex.*;

public class Q10 {

	public static void main(String[] args) {
		
//ip format = 000.000.000.000(0-255)

		String a = "192.034.44.1";
		String b[] = a.split("\\.");
		
		boolean flag = true;
		if (!(b.length == 4)) {
			flag = false;
		}
		
		for(int i=0; i<b.length; i++) {
			if (!(Integer.parseInt(b[i]) > 0 && Integer.parseInt(b[i]) <=255)) {
				flag = false;
			}
		}
		
		String regex = "^[1-9]{1-3}";
		Pattern Patt = Pattern.compile(regex);
		for(int i=0; i<b.length; i++) {			
			Matcher match = Patt.matcher(b[i]);
			if(match.matches()) {
				flag = false;
			}
		}
		
		System.out.println(flag);
		
		
	}

}