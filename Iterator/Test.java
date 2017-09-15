public class Test{

    public static void main(String[] args) {
        Collection<String> Str= new Collection<String>(10);

        Str.add("hola");
        Str.add("hola1");
        Str.add("hola2");
        Str.add("hola3");

        System.out.println("" + Str.at(0));

        Iterator t = Str.getIterator();
        while(t.hasNext())
        {
            System.out.println(""+ t.next());
        }

    }

    
}