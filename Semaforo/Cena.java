
import java.util.concurrent.Semaphore;
public class Cena implements Runnable
{
    Semaphore sillas;
    Semaphore tenedores;
    Semaphore cuchillos;
    String s;
    public Cena (String s, Semaphore sillas, Semaphore tenedores,Semaphore cuchillos)
    {
        this.s = s;
        this.sillas = sillas;
        this.tenedores = tenedores;
        this.cuchillos = cuchillos;
    }
    @Override
    public void run() 
    {
        try {
            sillas.acquire();
            tenedores.acquire();
            cuchillos.acquire();
            System.out.println("" + s + " comiendo");
            
            Thread.sleep(6000);
            sillas.release();
            tenedores.release();
            cuchillos.release();
        } catch (InterruptedException ex) 
        {
            
        }
    }
    public static void main (String []args)
    {
        Semaphore sillas = new Semaphore(6);
        Semaphore tenedores = new Semaphore(5);
        Semaphore cuchillos = new Semaphore(4);
        
        Thread ch1 = new Thread(new Cena("chino 1",sillas,tenedores,cuchillos));
        Thread ch2 = new Thread(new Cena("chino 2",sillas,tenedores,cuchillos));
        Thread ch3 = new Thread(new Cena("chino 3",sillas,tenedores,cuchillos));
        Thread ch4 = new Thread(new Cena("chino 4",sillas,tenedores,cuchillos));
        Thread ch5 = new Thread(new Cena("chino 5",sillas,tenedores,cuchillos));
        Thread ch6 = new Thread(new Cena("chino 6",sillas,tenedores,cuchillos));
        Thread ch7 = new Thread(new Cena("chino 7",sillas,tenedores,cuchillos));
        Thread ch8 = new Thread(new Cena("chino 8",sillas,tenedores,cuchillos));
        Thread ch9 = new Thread(new Cena("chino 9",sillas,tenedores,cuchillos));
        Thread ch10 = new Thread(new Cena("chino 10",sillas,tenedores,cuchillos));
        Thread ch11 = new Thread(new Cena("chino 11",sillas,tenedores,cuchillos));
        Thread ch12 = new Thread(new Cena("chino 12",sillas,tenedores,cuchillos));
        Thread ch13 = new Thread(new Cena("chino 13",sillas,tenedores,cuchillos));
        Thread ch14 = new Thread(new Cena("chino 14",sillas,tenedores,cuchillos));
        Thread ch15 = new Thread(new Cena("chino 15",sillas,tenedores,cuchillos));
        ch1.start();
        ch2.start();
        ch3.start();
        ch4.start();
        ch5.start();
        ch6.start();
        ch7.start();
        ch8.start();
        ch9.start();
        ch10.start();
        ch11.start();
        ch12.start();
        ch13.start();
        ch14.start();
        ch15.start();
    }
    
}