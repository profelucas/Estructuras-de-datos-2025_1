class piladinamica{
    private Nodo cima;

    public piladinamica(){
        this.cima=null;
    }
    public void apilar(Object x){
        Nodo nuevo = new Nodo(x);
        
        if (this.cima ==null){
            this.cima=nuevo;
        }else{
            Nodo aux=new Nodo(this.cima);
            this.cima=nuevo;
            this.cima.setsiguiente(aux);
        }
    }

    public void desapilar(){
        if(this.cima==null){
            System.out.println("Esta vacio");
        }else{
            Nodo aux=new Nodo(this.cima);
            this.cima=this.cima.getsiguiente();
            aux.setsiguiente(null);
        }

    }

    public void mostrar(){
        if(this.cima==null){
            System.out.println("Esta vacio");
        }else{
            Nodo aux=new Nodo(this.cima);
            while(aux!=null){
                System.out.println(aux.getelemento().toString());
                aux=aux.getsiguiente();
            }
        }
    }
}