package dowhi;
import java.lang.*;
import java.util.Scanner;
class a{
	String name;
	int id;
	void set_name(String n)
	{
		name=n;
	}
	void set_id(int i)
	{
		id=i;
	}
}
class b extends a
{
	String depar;
	void set_depar(String d)
	{
		depar=d;
	}
	String get_depar()
	{
		return depar;
	}
	public void add()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name:");
		name=sc.nextLine();
		System.out.println("enter the depar:");
		depar=sc.nextLine();
		System.out.println("enter the id:");
		id=sc.nextInt();
		set_name(name);
		set_id(id);
		set_depar(depar);
	System.out.println(get_name());
	System.out.println(get_id());
	System.out.println(get_depar());
	
	}
	private char[] get_id() {
		// TODO Auto-generated method stub
		return null;
	}
	private char[] get_name() {
		// TODO Auto-generated method stub
		return null;
	}
}
public class Funtion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String name;
        String depar;
        int id;
        b c=new b();
        c.add();
	}

}
