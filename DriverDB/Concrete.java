public class Concrete extends Creator
{
    public void create(String typeP)
    {
        if(typeP.compareTo("DriverDBMongo")== 0)
        {
            driver = new DriverDBMongo();
            ((DriverDBMongo)driver).CrearLogFile();
            ((DriverDBMongo)driver).EstablecerConexion();
            ((DriverDBMongo)driver).openConect();;
        }
    }
}