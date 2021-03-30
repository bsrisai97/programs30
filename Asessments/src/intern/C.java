package intern;

class C extends Inheritance
{
	int k=30;
	void c()
	{
		System.out.println("princess"+k);
	}
	void b() {
		int i=30;
		System.out.println("hellomster"+i);
	}
	public static void main(String[] args) {
		C x=new C();
		x.c();
		x.b();
		x.a();
	}
}