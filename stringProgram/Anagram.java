package stringProgram;

public class Anagram {
	String sort(String input) {
		String output = "";
		char c[] = input.toCharArray();
		for (int i = 0; i < c.length; i = i + 1) {
			for (int j = i + 1; j < c.length; j = j + 1) {
				if (c[i] < c[j]) {
					char temp = c[i];
					c[i] = c[j];
					c[j] = temp;
				}
			}
		}
		for (int i = 0; i < c.length; i = i + 1) {
			output = output + c[i];
		}
		return output;
	}

	public static void main(String[] args) {
		Anagram o = new Anagram();
		String a = "care";
		String b = "race";
		String x = o.sort(a);
		String y = o.sort(b);
		if (x.equals(y)) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not Anagram");
		}

	}

}
