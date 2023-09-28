package practiceMethod;

public class AvgOfNum {
//1.find the average of given four numbers[27,31,21,19]
	double Average(double a,double b,double c,double d)
	{
		double avg=(a+b+c+d)/4.0;
		System.out.println(avg);
		return avg;
		
		
	}
	
	
	public static void main(String[] args) {
AvgOfNum avgofnum=new AvgOfNum();
avgofnum.Average(27, 31, 21, 19);
		
		
		
	}

}
