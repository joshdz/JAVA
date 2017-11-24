import java.util.concurrent.CyclicBarrier;

public class Barreras {

    public static void main(String[] args) {
        Runnable saludo = new Runnable(){
            
            public void run(){
                System.out.println("Todos los hilos terminaron");
            }
        };

        CyclicBarrier barr = new CyclicBarrier(10, saludo);
        Thread[]arreglo = new Thread[10];
        for (int i = 0; i<10; i++){
            arreglo[i] = new Thread(new Factorial((i+1), barr));
            arreglo[i].start();

        }
    }
}