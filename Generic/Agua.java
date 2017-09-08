public class Agua extends Drinks implements Comparable
{
    public int ml;
    public void tomar()
    {
        System.out.println("Tomando agua");
    }

    public int compareTo(Object o){
        Agua temp = (Agua) o;
        if(ml<temp.ml)
        {
            return -1;
        }
        if (ml>temp.ml)
        {
            return 1;
        }

        return 0;
    }

    
    public boolean equals(Object o){
        System.out.println(o.getClass().getName());
        if(o.getClass().getName().equals("Soda"))
        {
            return (ml == ((Soda)o).ml);
        }
        return (ml == ((Agua)o).ml);
    }
}