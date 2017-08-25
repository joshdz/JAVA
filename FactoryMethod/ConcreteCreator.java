public  class ConcreteCreator extends Creator
{
    public  void create(String typeProduct)
    {
        if(typeProduct.compareTo("Producto1")== 0)
        {
            product = new Product();
            ((Product)product).construirParte1();
            ((Product)product).construirParte2();
        }

        if(typeProduct.compareTo("Producto2")== 0)
        {
            product = new Product2();
            ((Product2)product).complex1();
            ((Product2)product).complex2();
        }
    }
    
}