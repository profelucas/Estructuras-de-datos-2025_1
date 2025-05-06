class Nodo{
    private Piloto p;
    private Nodo sig;

    public Nodo(Piloto p){
        this.p=p;
        this.sig=null;
    }

    public void setp(Piloto p){
        this.p=p;
    }
    public void setsig(Nodo a){
        this.sig=a;
    }

    public Piloto getp(){
        return this.p;
    }
    public Nodo getsig(){
        return this.sig;
    }
}