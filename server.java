
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class server {


	public static void main(String[] args)
	{
		
		try {
		
	
			ServerSocket server = new ServerSocket(123);
            Socket s = server.accept();
          
            Scanner sc = new Scanner(s.getInputStream());
	        int number = sc.nextInt();
		    int temp=number*number;
		    PrintStream p=new PrintStream(s.getOutputStream());
		    p.println(temp);
		    
			
			
		    } 
		catch (Exception e) 
		    {

			e.printStackTrace();
		    }
		

	}

}
