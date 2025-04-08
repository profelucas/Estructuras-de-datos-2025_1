class Nodo{
    private Object el;
    private Nodo sig;

    public Nodo(Object x){
        this.el=x;
        this.sig=null;
    }

    public Object getelemento(){
        return this.el;
    }
    public Nodo getsiguiente(){
        return this.sig;
    }

    public void setelemento(Object x){
        this.el=x;
    }
    public void setsiguiente(Nodo x){
        this.sig=x;
    }
    @Override
    public String toString(){
        return (String) this.el;
    }
}
