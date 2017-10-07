package dowhi;
import java.lang.*;
import java.util.Scanner;
public class Do {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]=new int[20];
    int i,j,sum=0;int n[]=new int[20];
    char str[]=new char[20];
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number of n is :");
    for(i=0;i<5;i++)
    {
    	n[i]=sc.nextInt();
    }
    for(j=0;j<5;j++)
    {
    	sum=sum+n[j];
    }
    System.out.println(sum);
	}

}
