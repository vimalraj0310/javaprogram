package LearningString;

public class practice {
    public static void main(String[] args ){
        String o = "mohammed";
        int count = 0;
        char search = 'm';
        for(int i =0;i< o.length();i=i+1)
        {
            if(o.charAt(i)==search)
            {
                count = count+1;
            }
        }
        System.out.print(count);

    }
}
/*public class occurence
{
public static void main (String args[])
{
String o = "mohammed";
int count = 0;
char search = 'm';
for(int i =0;i< o.length();i=i+1)
{
if(o.charAt(i)==search);
{
count = count+1;
}
}
System.out.print(count);
}
}*/