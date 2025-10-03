package coms;

import java.io.*;
import java.net.*;
import java.util.*;

public class Client {

    public static void main(String[] args) throws Exception 
    {
    	Scanner in = new Scanner(System.in);
        Socket clientSocket = new Socket("127.0.0.1", 4000);
        System.out.println("****Client side****");
        System.out.println("Enter the fle name to transfer");
        String fname=in.nextLine();
        OutputStreamostream=clientSocket.getOutputStream();
        PrintWriterpwrite=new PrintWriter(ostream,true);
        pwrite.println(fname);
        InputStreamistream=clientSocket.getInputStream();
        BufferedReadersocketRead=new BufferedReader(new InputStreamReader(istream));
        System.out.println("Contents of the file"+fname+"are");
        String str;
        while((str=socketRead.readLine())!=null)
        {
        	System.out.println(str);
        }
        pwrite.close();
        socketRead.close();
        
        }
}
        

    
