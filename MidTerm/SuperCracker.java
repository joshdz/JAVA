public abstract class SuperCracker{

    protected String host;
    protected String ip;
    protected Dictionary dictionary;

    public abstract void setHost(String host);
    public abstract void setIP(String ip);
    public abstract void setDictionary(Dictionary dictionary);
    public abstract String crackPwd();

}