class ListaCircular{

    private Nodo primero;
    private Nodo ultimo;

    public ListaCircular(){
        this.primero=this.ultimo=null;
    }

    public void Ingresar_primero(Object x){
        Nodo nuevo =new Nodo(x);
        if(this.primero==null){
            this.primero=this.ultimo=nuevo;
        }else{
            nuevo.setsiguiente(this.primero);
            this.primero=nuevo;
        }
        this.ultimo.setsiguiente(this.primero);

    }
    public void ingresar_ultimo(Object x){
        Nodo nuevo = new Nodo(x);
        if(this.ultimo==null){
            this.primero=this.ultimo=nuevo;
        }else{
            this.ultimo.setsiguiente(nuevo);
            this.ultimo=nuevo;
        }
        this.ultimo.setsiguiente(this.primero);
    }

    public void ingresar_medio(Object x,int pos){
        Nodo nuevo = new Nodo (x);
  
        Nodo aux = this.primero;
  
        for (int i = 1; i < pos; i++) {
          aux=aux.getsiguiente();
        }
        nuevo.setsiguiente(aux.getsiguiente());
        aux.setsiguiente(nuevo);
  
      }

      public void Eliminar_primero(){
        if(this.primero==null){
            System.out.println("La lista esta vacia");
            return;
        }
        this.ultimo.setsiguiente(this.primero.getsiguiente());
        this.primero=this.primero.getsiguiente();
      }

      public void eliminar_ultimo(){
        Nodo aux =this.primero;
        if(this.ultimo==null){
            System.out.println("Esta vacio");
            return;
        }
        while(aux.getsiguiente()!=this.ultimo){
            aux=aux.getsiguiente();
        }
        aux.setsiguiente(this.primero);
        this.ultimo=aux;
      }
      //desafio
      public void eliminar_medio(int pos){

      }

      public void mostrar(){
        Nodo aux= this.primero;

        do{
            System.out.println(aux.getelemento());
            aux=aux.getsiguiente();
        }while(aux!=this.primero);
      }
}