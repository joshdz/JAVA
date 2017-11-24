    import java.net.*;
    import java.io.*;
    public class Server 
    {
        public static void main (String[]args) throws IOException
        {
            try
            {
                int port = 2221;
                ServerSocket server = new ServerSocket(port);
                Socket cliente = server.accept();
                PrintWriter out = new PrintWriter(cliente.getOutputStream());
                BufferedReader in = (new BufferedReader(new InputStreamReader(cliente.getInputStream())));
                String line = "no estes molestando";
                while((line = in.readLine())!= null)
                {
                    System.out.println(line);
                    out.println("servidor repite"+ line);
                    
                }
            }catch(IOException ex)
            {
                
            }
        }
    }