import java.net.*;
import java.util.*;
import java.io.*;
public class ProcessRequest implements Runnable {
  Socket client;
  StringBuffer message;
  Vector<StringBuffer> v;
    public ProcessRequest(Socket client, Vector<StringBuffer> v) {
        this.client = client;
        this.v = v;
    
}
    public void run(){
         int c; message = new StringBuffer();
         try{
             BufferedInputStream bis = new BufferedInputStream(client.getInputStream());
             InputStreamReader isr = new InputStreamReader(bis);

             BufferedOutputStream bos = new BufferedOutputStream(client.getOutputStream());
             OutputStreamWriter osw = new OutputStreamWriter(bos);

             while((c = isr.read())!= (char)13)
             {
                 message.append((char)c);
             }
            
             v.addElement(message);
        

             System.out.println("Client connected:" + message);
          

             
             osw.write("Request Accepted" + (char)13);
             osw.flush();
             client.close();

         }
          catch (IOException ex) 
        {
       
        }
        
    }
}