public abstract class Builder{
    protected Hamburger hamburger;
    protected abstract Hamburger buildHamburger(); 
    public abstract void buildeBread();
    public abstract void buildMeat();
    public abstract void buildTom();
    public abstract void buildPine();

    public Hamburger getHamburger()
    {
        return hamburger;
    }

    public void createHamburger()
    {
        hamburger = buildHamburger();
        buildeBread();
        buildMeat();
        buildTom();
        buildPine();
    }
}