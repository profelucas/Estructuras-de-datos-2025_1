class Coladinamica {
    private Nodo primero;
    private Nodo ultimo;
    
    public Coladinamica(){
        this.primero=this.ultimo=null;
    }

    public void ingresar(Object x){
        Nodo nuevo = new Nodo(x);
        if(this.primero==null){
            this.primero=this.ultimo=nuevo;
        }else{
            this.ultimo.setsiguiente(nuevo);
            this.ultimo=nuevo;
        }
    }

    public void eliminar(){
        if(this.primero==null){
            System.out.println("vacio");
        }else{
            this.primero=this.primero.getsiguiente();
        }
    }

    public void mostrar(){
        if(this.primero==null){
            System.out.println("vacio");
        }else{
            Nodo aux = this.primero;
            while(aux!=null){
                System.out.println(aux.getelemento().toString());
                aux=aux.getsiguiente();
            }
        }
    }

    
}
