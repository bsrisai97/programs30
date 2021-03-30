package statements;

public class If {
public static void main(String[] args)
{
	int a=2026;
	if((a%4==0)&&(a%100!=0)||(a%400==0))
	{
		System.out.println("a is leap");
	}
	else
	{
		System.out.println("a is nt leap");
	}
}
}
