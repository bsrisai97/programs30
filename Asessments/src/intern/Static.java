package intern;

public class Static 
{
	int a;
	String name;
	static String clg="sri sai";

Static(int id,String n)
{
	a=id;
	name=n;
	System.out.println(a+" "+name);
}
public void run()
{
	System.out.println(a+""+name);
}
public static void main(String args[])
{
	Static s=new Static(15,"ravi");
	
	int b=s.a;
	System.out.println(b);
	
}
}
