class Nodo{
    private Persona el;
    private Nodo sig;

    public Nodo(Persona x){
        this.el=x;
        this.sig=null;
    }

    public Persona getelemento(){
        return this.el;
    }
    public Nodo getsiguiente(){
        return this.sig;
    }

    public void setelemento(Persona x){
        this.el=x;
    }
    public void setsiguiente(Nodo x){
        this.sig=x;
    }
    @Override
    public String toString(){
        return this.el.toString();
    }
}
