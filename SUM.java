import java.util.Scanner;

class a
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
class b extends a{
	int i,n,j,k;
	void show()
	{
		System.out.println("press 1 for add:\n");
		System.out.println("press 2 for multip:\n");
		System.out.println("press 0 for exit:");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the of n is:");
		do {
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
public class SUM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b c=new b();
		c.show();

	}

}
