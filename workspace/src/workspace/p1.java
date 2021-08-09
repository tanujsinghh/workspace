package workspace;

public class p1 {

	public static void main(String[] args) {
		// to convert odd length letter middle word to upper case and even ones first word to upper case
		
		String s=      "hello hi good noon hope we got thread safety";
		System.out.println(convertIfOdd(s));

	}

	public static String convertIfOdd(String s) {
		String str1[] = s.split(" ");
		StringBuilder z = new StringBuilder();
		for (int i = 0; i < str1.length; i++) {
			if(str1[i].length() % 2 != 0) {
				z.append(str1[i].substring(0, str1[i].length()/2)).append(Character.toUpperCase(str1[i].charAt(str1[i].length()/2))).append(str1[i].substring(str1[i].length()/2 +1)).append(" ");
			}
			else {
				z.append(Character.toUpperCase(str1[i].charAt(0))).append(str1[i].substring(1)).append(" ");
			}
		}
		return z.toString().trim();
		
	}

}
