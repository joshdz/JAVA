public class Test{

    public static void main(String[] args) {
        
        Creator c = new ConcreteCreator();
        SuperCracker s = c.factoryMethod("Cracker",  Dictionary.get(),"localhost", "255.255.255.255");
        Dictionary d = Dictionary.get();
        System.out.println(d);
        System.out.println(s);
        
        Dictionary x = Dictionary.get();
        x.addWord("hola");
       
}
}
