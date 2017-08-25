public class Test
{
    public static void main(String[] args) {
        Creator c = new ConcreteCreator();
        FatherProd p = c.factoryMethod("Producto2");
        FatherProd p1 = c.factoryMethod("Producto1");
    }
}