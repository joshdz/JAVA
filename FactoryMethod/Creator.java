public abstract class Creator
{
    public abstract void create(String typeProduct);
    public FatherProd factoryMethod(String typeProduct)
    {
        
        create(typeProduct);
        return product;
    }

    protected FatherProd product;
    
}
