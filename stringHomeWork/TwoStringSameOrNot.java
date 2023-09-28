package stringHomeWork;

public class TwoStringSameOrNot {
	//1. How to compare two strings are same or not ?
	public static void main(String[] args) {
		 String a = "java";
	        String b = "java";
	        boolean flag = false;
	        for (int i = 0; i < a.length(); i = i + 1) {
	            for (int j = i; j <= i; j++) {
	                if (a.length() == b.length()) {
	                    if (a.charAt(i) == b.charAt(j)) {
	                        flag = true;
	                    }
	                }
	            }

	            }
	//System.out.println(a.equals(b));

	            System.out.println(flag);
	}

}
