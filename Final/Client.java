import java.net.*;
import java.io.*;
public class Client {
public static void main(String[] args) {
    String host = "localhost";
    int port = 4444;
    StringBuffer mensaje = new StringBuffer();

    try {
        InetAddress add = InetAddress.getByName(host);
        Socket cliente = new Socket(add, port);

        BufferedInputStream bis = new BufferedInputStream(cliente.getInputStream());
        InputStreamReader isr = new InputStreamReader(bis);

        BufferedOutputStream bos = new BufferedOutputStream(cliente.getOutputStream());
        OutputStreamWriter osw = new OutputStreamWriter(bos);

         osw.write("Se ha conectado el cliente"+((char)13));
         osw.flush();

         int c;
         while((c = isr.read()) !=13)
         {
             mensaje.append((char)c);
         }
           System.out.println(mensaje);
           cliente.close();

    } catch (UnknownHostException ex) {
        //TODO: handle exception
    }
    catch (IOException ex) {
        //TODO: handle exception
    }
}
    
}