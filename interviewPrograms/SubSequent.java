package interviewPrograms;

public class SubSequent {

	public static void main(String[] args) {
int a[]= {1,2,3,4};
int b[]= {1,3,4};
int counter=0;
int c=b.length;
for(int i=0;i<a.length;i=i+1)
{
	for(int j=0;j<b.length;j=j+1)
	{
		if(a[i]==a[j])
		{
			counter=counter+1;
		}
	}
}
if(c==counter)
{
	System.out.println("it is Sequent");
}
else
{
	System.out.println("not Sequent");
}
	}

}
