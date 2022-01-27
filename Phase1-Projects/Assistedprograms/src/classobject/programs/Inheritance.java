package classobject.programs;

class A 
{
	public int i=20;
}
class B extends A
{
	public int j=10;
	public void test()
	{
		System.out.println("i value : "+i);
		System.out.println("j value : "+j);
	}
}

class Inheritance
{

	public static void main(String[] args) 
	{
		B b1 = new B();
		b1.test();
	}
}
