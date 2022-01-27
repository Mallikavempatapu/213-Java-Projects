package classobject.programs;


	abstract class C 
	{
		abstract public void move();
		abstract public void walk();
	}
	class D extends C
	{
		public void move()
		{
			System.out.println("move.......!");
		}
		public void walk()
		{
			System.out.println("walk.......!");
		}
	}
	class Abstraction
	{
		public static void main(String[] args) 
		{
			System.out.println("main starts.....");
			D obj=new D();
			obj.move();
			obj.walk();
			System.out.println("main ends.....");
		}
	}



