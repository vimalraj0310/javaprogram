package LearningString;

public class Palindrom {
    public static void main(String[] args){
        String x="Malayalam";
        String y="";
        for(int i=x.length()-1;i>=0;i=i-1) {
            y = y + x.charAt(i);
        }
            if (x.equalsIgnoreCase(y)) {
                System.out.println("palindrom");

            } else {
                System.out.println("Not Palindrom");

        }
    }
}
