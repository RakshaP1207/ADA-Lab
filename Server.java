package coms;
import java.io.*;
import java.net.*;
public class Server {
	 public static void main(String[] args) throws Exception 
	    {
		 ServerSocketSerSocket=new ServerSocket(4000);
		 System.out.println("****Server Side****");
		 System.out.println("Server ready for connection");
		 Socket connSock=servSocket.accept();
		 System.out.println("Connection is successful and ready for file transfer");
		 InputStreamistream=connSock.getInputStream();
		 BufferedReaderfileRead=new BufferedReader(new InputStreamReader(istream));
		 String fname=fileRead.readLine();
		 File fileName=new File(fname);
		 OutputStreamostream=connSock.getOutputStream();
		 PrintWriterpwrite=new PrintWriter(osteam,true);
		 if(fileName.exists()) {
			 BufferedReadercontentRead=new BufferedReader(new FileReader(fname));
			 System.out.println("Writing file COntents to the socket");
			 String str;
			 while((str=contentRead.readLine())!=null)
			 {
				 pwrite.println(str);
			 }
			 contentRead.close();
		 }
		 else
		 {
			 System.out.println("Requested file does not exist");
			 String msg=("Requested file does not exist");
			 pwrite.println(msg);
		 }
		 connSock.close();
		 servSocket.close();
		 fileRead.close();pwrite.close();
	    }
}

		
