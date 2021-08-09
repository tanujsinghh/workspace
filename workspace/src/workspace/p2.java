package workspace;

public class p2 {

	public static void main(String[] args) {
		// program to check whether the website is secured or not
		
				System.out.print(isSecured("https://en.wikipedia.org/wiki/Main_Page"));
				System.out.print(isSecured("http://alibaba.com/"));
			}
			public static String isSecured(String url) {
				if(url.startsWith("https"))
					return "secured\n";
				else 
					return "not secured";
				
	}

}
