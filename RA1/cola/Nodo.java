class Nodo{
    //atributos
    private Object el;
    private Nodo sig;

    //constructor
    public Nodo(Object el){
        this.el=el;
        this.sig=null;
    }

    //gets
    public Object getelemento(){
        return this.el;
    }

    public Nodo getsiguiente(){
        return this.sig;
    }

    //sets
    public void setelemento(Object x){
        this.el=x;
    }

    public void setsiguiente(Nodo x){
        this.sig=x;
    }
    @Override
    public String toString(){
        return (String)this.el;
    }
}