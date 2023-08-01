package assignmentsDay8;

public class Q12 {

	public static void main(String[] args) {
		String a = "123@ShivAkshayRuppendraMiroyAditya";
		
		System.out.println(a);
//		int count = 0;

		int arr[] = new int[122]; //compare array
		
		for(int i=0; i<a.length(); i++) {
			char b = a.charAt(i);
			for(char j=0; j<122; j++) {
				if(b==j) {
					arr[j]++;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			if (arr[i] == 0) {				
				continue;
			}
			System.out.println((char)i+ " " +arr[i]);
		}
		

		
	}

}
