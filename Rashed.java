import java.util.Scanner;

import javax.lang.model.type.PrimitiveType;

class c
{
	int roll;
	void set_roll(int r)
	{
		roll=r;
	}
	int get_roll()
	{
		return roll;
	}
}
class d extends c{
	int i,n,j,k;
	void show()
	{
		System.out.println("enter the roll:\n");
		//Scanner sc=new Scanner(System.in);
		Scanner sc=new Scanner(System.in);
		roll=sc.nextInt();
		do {
			System.out.println("press 1 for add:\n");
			System.out.println("press 2 for multip:\n");
			System.out.println("press 0 for exit:");
		
			System.out.println("enter your choose:");
			n=sc.nextInt();
			if(n==1)
			{
				System.out.println("enter the number of i is:\n");
				System.out.println("enter the number of j is:\n");
				i=sc.nextInt();
				j=sc.nextInt();
				k=i+j;
				System.out.println("the totla value of k is:"+k);
			}
			if(n==2)
			{
				System.out.println("enter the number of i is:\n");
				System.out.println("enter the number of j is:\n");
				i=sc.nextInt();
				j=sc.nextInt();
				k=i-j;
				System.out.println("the totla value of k is:"+k);
			}
			if(n==0)
			{
				System.out.println("exit");
			}
			
			
		}while(n>=0);
		
	}
}


public class Rashed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
d e=new d();
e.show();

	}

}
