package encapsulationOOps;

public class GetSet {
private	String name;
private	int Age;
private	int ID;
private	double Salary;

public void setName(String name)
{
	this.name=name;
}


public String getName()
{
	return name;
}


	public int getAge() {
	return Age;
}


public void setAge(int age) {
	Age = age;
}


public int getID() {
	return ID;
}


public void setID(int iD) {
	ID = iD;
}


public double getSalary() {
	return Salary;
}


public void setSalary(double salary) {
	Salary = salary;
}


	public static void main(String[] args) {

		GetSet gs=new GetSet();
	System.out.println(gs.getName());	
	System.out.println(gs.getID());
	System.out.println(gs.getAge());
	System.out.println(gs.getSalary());
	
	gs.setName("vimal");
	gs.setID(3);
	gs.setAge(21);
	gs.setSalary(20000);
	System.out.println("\n");
	
	System.out.println(gs.getName());	
	System.out.println(gs.getID());
	System.out.println(gs.getAge());
	System.out.println(gs.getSalary());
	
	
	GetSet gs1=new GetSet();
	
	gs1.setName("yasin");
	gs1.setID(18);
	gs1.setAge(21);
	gs1.setSalary(20000);
	System.out.println("\n");
	
	System.out.println(gs1.getName());	
	System.out.println(gs1.getID());
	System.out.println(gs1.getAge());
	System.out.println(gs1.getSalary());
	
	
	GetSet gs2=new GetSet();

	gs2.setName("Anto");
	gs2.setID(07);
	gs2.setAge(24);
	gs2.setSalary(20000);
	System.out.println("\n");
	
	System.out.println(gs2.getName());	
	System.out.println(gs2.getID());
	System.out.println(gs2.getAge());
	System.out.println(gs2.getSalary());
	
		
		
	}

}
