
@SuppressWarnings("rawtypes")
public class Comparator<T>
{
    public boolean iguales(T a, T b)
    {
        return a.equals(b);
    }

    public <N extends Number & Comparable> N mayor(N a, N b){
        if (a.compareTo(b)> 0)
        {
            return a;
        }
        return b;
    }

    public<E,R> boolean igualesB(E a, R b)
    {
        return a.equals(b);
    }

    public static void main(String[] args) {
        Comparator c = new Comparator();
        String a = "hola";
        String b = "adios";

        Integer i = new Integer(7);
        Integer j = new Integer(5);

        Agua b1 = new Agua();
        b1.ml=500;
        Agua b2 = new Agua();
        b2.ml=500;
        Soda s = new Soda();
        s.ml=900;
        
        System.out.println("enteros "+ c.iguales(i, j));
        System.out.println("agua " + c.iguales(b1, b2));
        System.out.println(b1.compareTo(b2));
        System.out.println("Son iguales "+c.igualesB(b1, s));
        System.out.println("numeros "+c.mayor(5,4));
    }
}
