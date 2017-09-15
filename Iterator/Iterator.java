public class Iterator<T>{

    protected Collection<T> coll;
    int cont;
    public Iterator(Collection <T> coll)
    {
        this.coll = coll;
        cont = 0;
    }

    public boolean hasNext()
    {
        if (cont < coll.length()){
            return true;
        }

        return false;
    }


    public T next()
    {
        return coll.at(cont++);
    }
}