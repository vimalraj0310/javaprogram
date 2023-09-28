package encapsulation;

public class StudentInfo_Encapsulation {
private String name;
private	int Age;
private	String Standard;

	
	public String getName() {
		return name;
	}






	private void setName(String name) {
		this.name = name;
	}






	public int getAge() {
		return Age;
	}






	public void setAge(int age) {
		Age = age;
	}






	public String getStandard() {
		return Standard;
	}






	public void setStandard(String standard) {
		Standard = standard;
	}






	
	
	
	
	

	public static void main(String[] args) {
		//getter setter using Encapsulation
		StudentInfo_Encapsulation Student1=new StudentInfo_Encapsulation();
		Student1.setName("vimal");
		Student1.setAge(21);
		Student1.setStandard("degree Completed");
		
		StudentInfo_Encapsulation Student2=new StudentInfo_Encapsulation();
	Student2.setName("kiruthika");
	Student2.setAge(21);
	Student2.setStandard("degree Completed");
		
		
	
	System.out.println(Student1.name+" "+Student1.Age+" "+Student1.Standard);
	System.out.println(Student2.name+" "+Student2.Age+" "+Student2.Standard);
	
	Student2.setName("kiruthi");
	System.out.println(Student2.getName());
	
	}

}
