class listaSimple{
  //atributos
    private Nodo primero;
    private Nodo ultimo;

    //Constructor

    public listaSimple(){
      this.primero=this.ultimo=null;
    }


    //ingresar

    public void ingresar_primero(Object x){
      Nodo nuevo = new Nodo(x);
      if(this.primero==null){
        this.primero=this.ultimo=nuevo;
      }else{
        nuevo.setsiguiente(this.primero);
        this.primero=nuevo;
      }
    }

    public void ingresar_ultimo(Object x){
      Nodo nuevo = new Nodo(x);
      if(this.ultimo==null){
        this.primero=this.ultimo=nuevo;
      }else{
        this.ultimo.setsiguiente(nuevo);
        this.ultimo=nuevo;
      }
      
    }

    public void eliminar_primero(){
      if(this.primero==null){
        System.out.println("vacio");
        return;
      }

      this.primero=this.primero.getsiguiente();
      
    }
    //desafio
    public void eliminar_ultimo(){

    }
    //desafio
    public void eliminar_medio(int pos){

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

    public void mostrar(){
      Nodo aux = this.primero;

      while(aux!=null){
        System.out.println(aux.getelemento().toString());
        aux=aux.getsiguiente();
      }
    }
  }