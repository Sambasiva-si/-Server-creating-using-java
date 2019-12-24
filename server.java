//first we are taking module from java.net
//next we are creating a new server socket(4000)
//next we are accepting a client by using server.accept
import java.net.*;
class server
{
	public static void main(String[]args)
	{
		try
		{
			ServerSocket server=new ServerSocket(4000);
			Socket s=server.accept();
		System.out.println("Connected to the server**");
		}catch(Exception e){}
	}

}
