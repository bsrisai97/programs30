package intern;

public class Constructor 
{
	int i;
	String name;
	int age;
   Constructor(int id,String n,int a)
		{
		i=id;
		name=n;
		age=a;
		System.out.print(i+""+name+""+age);
		
	}
public static void main(String...arg)
{
	Constructor e=new Constructor(18, "sai", 56);
	
}
}
