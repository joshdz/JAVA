import java.util.*;
import java.net.*;
import java.io.*;
public class MultiThreadSocket {
 public static void main(String[] args) {
    Vector v=new Vector<StringBuffer>();
     try {
        int port = 4444;
        ServerSocket server = new ServerSocket(port);
        Socket clients;
       
    
        for (int i=1 ; i<=10 ; i++ )
        {
          
            clients = server.accept();
            ProcessRequest other = new ProcessRequest(clients,v);
            Thread t = new Thread(other);
            t.start();
                
        }
        for(int i=0; i< v.size(); i++){
            
            System.out.println("Vector guardando mensaje" + v.get(i));
          }
     } catch (IOException ex) {
         
     }
 }
    
}