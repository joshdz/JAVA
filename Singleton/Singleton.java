
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Singleton{
    private static Singleton instance;

    private Singleton()
    {
        
    }

    public static Singleton getInstance()
    {
        if(instance == null)
        {
            instance = new Singleton();
        }

        return instance;
    }

    void doOperations()
    {
        System.out.println("Esta es una de las operaciones");
    }

    void getHora()
    {
        System.out.println( new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime()) );
    }

    void getDate()
    {
        System.out.println( new SimpleDateFormat("yyyy/MM/dd").format(Calendar.getInstance().getTime()) );
    }

}