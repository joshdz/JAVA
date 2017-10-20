public class Cracker extends SuperCracker{

    public void setHost(String host)
    {
        this.host= host;
        System.out.println(""+host);
    }
    public void setIP(String ip)
    {
        this.ip= ip;
        System.out.println(ip);
    }
    public  void setDictionary(Dictionary dictionary)
    {
        this.dictionary= dictionary;
        System.out.println(dictionary);
    }
    public  String crackPwd()
    {
        return "password";
    }


}