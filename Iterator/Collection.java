
public class Collection<T> {

   protected Object[] arreglo;
   protected int cont;

   public Collection (int size){
        arreglo = new Object[size];
        cont=0;
   }

   public   T at (int idx)
   {
         return (T)arreglo[idx];
   }

   public void add(T element)
   {
       if(cont < arreglo.length)
       {
           arreglo[cont] = element;
           cont++;
       }
   }

   Iterator getIterator(){
       return new Iterator<T>(this);
   }


        public int length(){
            return cont;
        }
}