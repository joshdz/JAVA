public abstract class Creator
{
    public abstract void create(String typeP);

    public Driver factoryMethod(String typeP)
    {
        create(typeP);
        return driver;
    }

    protected Driver driver;
}