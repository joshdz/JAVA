public class Dictionary<T>{

    public static Dictionary dictionary;
    String[] dic;
    int contador;

    private Dictionary(){
        dic = new String[10];
        contador = 0;

    }

    public static Dictionary get(){
        if (dictionary == null){
            dictionary = new Dictionary();
        }
        return dictionary;
    }

    public void addWord(String a){
        if(contador < dic.length)
        {
            dic[contador]= a;
            contador = contador ++;
        }
        
    }

    Iterator getIterator(){
        return new Iterator<T>(this);
    }

         public int length(){
             return contador;
         }

    public   T at (int idx)
         {
               return (T)dic[idx];
         }

        
      
    

    
}