public  class DoubleBuilder extends Builder{
     
    public Hamburger buildHamburger()
    {
        return new DoubleBurger();
    }

    public void buildeBread(){
        Bread b = new Bread();
        hamburger.setBread(b);
    }
    
    public void buildMeat(){
        hamburger.setMeat(new Meat());
    }
    public void buildTom(){
        hamburger.setTomatoe(new Tomatoe());
    }
    public void buildPine(){
        System.out.println("NO PINE APPLE!!!!!!!");
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