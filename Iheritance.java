import java.util.Scanner;
import java.util.*;
class mango
{
	String name;
	float rate;
	void set_name(String n)
	{
	name=n;
	}
	String get_name()
	{
		return name;
		
	}
	void set_rate(float r)
	{
		rate=r;
	}
	float get_rate()
	{
		return rate;
	}
}
class Fruit extends mango
{
	void show()
	{
		System.out.println(get_name());
		System.out.println(get_rate());
		
	}
}

public class Iheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		float rate;
Fruit abc=new Fruit();
Scanner sc=new Scanner(System.in);
name=sc.nextLine();
rate=sc.nextFloat();
abc.set_name(name);
abc.set_rate(rate);

abc.show();
}
}
