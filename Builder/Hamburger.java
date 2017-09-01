public abstract class Hamburger{

    public abstract void hambType();
    protected Bread bread;
    protected Meat meat;
    protected Tomatoe tom;
    protected Pineapple pineapp;

    public void setBread(Bread bread){
        this.bread = bread;
    }
        
    
    public void setMeat(Meat meat){
        this.meat = meat;
    }

    public void setPineapple(Pineapple pineapp){
        this.pineapp = pineapp;
    }

    public void setTomatoe(Tomatoe tom){
        this.tom = tom;
    }

    
}