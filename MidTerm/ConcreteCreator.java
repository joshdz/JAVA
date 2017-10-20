public class ConcreteCreator extends Creator{

    public void create(String typeCracker, Dictionary dictionary, String host, String ip)
    {
        cracker = new Cracker();
        cracker.setHost(host);
        cracker.setIP(ip);
        cracker.setDictionary(dictionary);
        
    }

}