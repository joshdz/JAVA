import java.util.concurrent.*;

public class Factorial extends Thread{
    
    int num;
    CyclicBarrier barrera;
    int resultado;
    
    public Factorial(int num, CyclicBarrier barrera){
    
        this.num = num;
        this.barrera = barrera;
    
    }
    
        public void run(){
    
            
            try {
    
                factorial(num);
                barrera.await();
                
            } catch (InterruptedException ex) {
                
            } catch (BrokenBarrierException ex){
                
            }
            
    
        }
        int factorial (int n){
            int accum = 1;
            for (int i = n; i > 0; i--){
    
                accum *= i;
            }
            return accum;
        }

        /**
         * @return the resultado
         */
        public int getResultado() {
            return resultado;
        }
    }