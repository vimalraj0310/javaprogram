package LearningString;

public class FindWord {
    public static void main(String[] args){
        String x="india is my country";
        String y[]=x.split(" ");
boolean flag=false;
for(String i:y)
{
    if(i.equals("my")){
        flag=true;
    }
}
System.out.println(flag);
    }
}
