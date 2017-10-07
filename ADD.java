package add;

import java.util.Scanner;

public class ADD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("egfjgjgv");
		Scanner sc=new Scanner(System.in);
       int i,j,k;
       int a[]=new int[40];
       System.out.println("enter the number:\n");
       for(i=0;i<6;i++)
       {
    	    //a[i]=sc.nextInt();
    	    //System.out.println("enter the number:\n");
    	    a[i]=sc.nextInt();
    	    System.out.println(a[i]);
       }
      int n;
       do {
    	      System.out.println("enter the number 1 for add:\n");
    	       System.out.println("enter the number 2 for addition:\n");
    	       System.out.println("enter the number 0 for exit:\n");
    	       System.out.println("enter the number of n:\n");
    	    n=sc.nextInt();
    	   if(n==1)
    	   {
    		   i=sc.nextInt();
    		   j=sc.nextInt();
    		   k=i+j;
    		   System.out.println(k);
    	   }
    	   if(n==2)
    	   {
    		   i=sc.nextInt();
    		   j=sc.nextInt();
    		   k=i*j;
    		   System.out.println(k);
    	   }
    	   if(n==0)
    	   {
    		  System.out.println("exit");
    	   }
    	   
       }while(n>=0);
	}

}
