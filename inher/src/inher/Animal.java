package inher;

public class Animal {
	void eat()	{
		System.out.println("animal eating");
	}

public class Demo extends Animal{
	void sleep()
	{
		System.out.println("animal sleeping");
	}
	public void main(String args[])
	{
		Animal a=new Animal();
		Demo d=new Demo();
		System.out.println(d+" "+a);
		a=d;
		a.eat();
	}
}
}
