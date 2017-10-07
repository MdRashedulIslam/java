///java polimorphism;
package Polimorphisn;
import java.lang.*;
import java.util.Scanner;
class student
{
	String name;
	int roll;
	 void set_student(int r,String n)
	{
		name=n;
		roll=r;
	}
		public void show()
		{
			System.out.println("from student");
			Scanner sc=new Scanner(System.in);
			name=sc.nextLine();
			roll=sc.nextInt();
		}
	
		
}
 class business extends student
{
	String com;
	void set_business(String b)
	{
		com=b;
	}
	public void show()
	{
		System.out.println("from business");
		Scanner sc=new Scanner(System.in);
		com=sc.nextLine();
	}
}

public class Polimorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student b1=new student();
         student b3=new business();
		b3.show();
     
	}

}
