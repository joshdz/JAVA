public abstract class Creator{

    public abstract void create(String typeCracker, Dictionary dictionary, String host, String ip);
    public SuperCracker factoryMethod(String typeCracker, Dictionary dictionary, String host, String ip)
    {
        
        create(typeCracker, dictionary, host, ip);
        return cracker;
    }

    protected SuperCracker cracker;
}