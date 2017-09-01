public class HawBuilder extends Builder{
    
    
    public  Hamburger buildHamburger()
    {
        return new Hawaiian();
    }

    public void buildeBread(){
        Bread b = new Bread();
        hamburger.setBread(b);
    }
    
    public  void buildMeat(){
        hamburger.setMeat(new Meat());
    }
    public void buildTom(){
        hamburger.setTomatoe(new Tomatoe());
    }
    public void buildPine(){
    hamburger.setPineapple(new Pineapple());
    }

}