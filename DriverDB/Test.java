public class Test
{
    public static void main(String[] args) {
        Creator c = new Concrete();
        Driver p = c.factoryMethod("DriverDBMongo");
        
    }
}