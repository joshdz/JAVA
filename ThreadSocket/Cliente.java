import java.io.OutputStreamWriter;
import java.io.*;
import java.net.*;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.Socket;


import org.omg.CORBA.portable.UnknownException;
public class Cliente{
public static void main(String[] args){
    String host = "localhost";
    int port = 1111;
    StringBuffer mensaje = new StringBuffer();
    try
    {
        InetAddress add = InetAddress.getByName(host);
        Socket cliente = new Socket(add, port);
        BufferedInputStream bis = new BufferedInputStream(cliente.getInputStream());    
        InputStreamReader isr = new InputStreamReader(bis);
        BufferedOutputStream bos = new BufferedOutputStream(cliente.getOutputStream());
        OutputStreamWriter osw = new OutputStreamWriter(bos);

        osw.write("SOY UN CLIENTE"+((char)13));
        osw.flush();

        int c;
        while((c=isr.read()) != 13)
        
        {
            mensaje.append((char)c);
        } 
        
        
    } 
    
    catch (Exception ex)
    {

    }
}
}

