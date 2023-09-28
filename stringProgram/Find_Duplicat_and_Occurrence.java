package stringProgram;

public class Find_Duplicat_and_Occurrence {

	public static void main(String[] args) {
		String name = "payiglagam";
        char[] arr = name.toCharArray();
        int count = 0;
        char one = ' ';

        for (int times = 0; times < arr.length; times++) {
            for (int sec = times + 1; sec < arr.length; sec++) {
                if ((arr[times] == arr[sec]) && (arr[times] != 32)) {
                    arr[sec] = ' ';
                    count++;
                    one = arr[times];

                }
                if ((sec == arr.length - 1) && (arr[times] == one) && (arr[times] != 32)) {
                    System.out.print(arr[times]+" = ");
                    System.out.print(count + 1);
                    System.out.println();
                    count = 0;
                }
            }
        }
		   
	

}
}