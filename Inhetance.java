import java.util.Scanner;
class a{
	String name;
	int id;
	float salary;
	void set_name(String n)
	{
		name=n;
	}
	String get_name()
	{
		return name;
	}
	void set_id(int i)
	{
		id=i;
	}
	int get_id()
	{
		return id;
	}
	void set_salary(float s)
	{
            salary=s;
	}
	float get_salary()
	{
		return salary;
	}
}
class b extends a
{
	public void show()
	{
		System.out.println("enter the print name,id,salary:\n");
		Scanner sc=new Scanner(System.in);
		name=sc.nextLine();
		id=sc.nextInt();
		salary=sc.nextFloat();
		set_name(name);
		set_id(id);
		set_salary(salary);
		System.out.println(get_name());
		System.out.println(get_id());
		System.out.println(get_salary());
		
	}
}
public class Inhetance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		float bonous;
		float d;
b c=new b();
c.show();
System.out.println("enter the bonus rate:\n");
bonous=sc.nextFloat();
d=(bonous*c.get_salary())/100;
System.out.println("the total salary with bonous is:\n");
System.out.println(d);
	}

}
