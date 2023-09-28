package stringProgram;

public class Sorting {

	public static void main(String[] args) {
		String x = "she sell sea shell on the sea shore ";
        String y[] = x.split(" ");
        for (int i = 0; i < y.length; i = i + 1) {
            for (int j = i + 1; j < y.length; j++) {
                if (y[i].compareTo(y[j]) > 0) {
                    String temp = y[i];
                    y[i] = y[j];
                    y[j] = temp;
                }

            }
            System.out.print(y[i]);
        }
	}

}
