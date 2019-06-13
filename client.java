import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class client {

	public static void main(String[] args) {
		try {
			Socket sc = new Socket("localhost",123);
			Scanner s=new Scanner(sc.getInputStream());
			Scanner s1=new Scanner(System.in);
			System.out.println("enter number");
			int number=s1.nextInt();
			PrintStream p=new PrintStream(sc.getOutputStream());
			p.println(number);
			System.out.println("the total calculation is");
			int temp=s.nextInt();
			System.out.println(+temp);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}

}
