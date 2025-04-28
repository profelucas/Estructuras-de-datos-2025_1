class listaSimple{
  //atributos
    private Nodo primero;
    private Nodo ultimo;

    //Constructor

    public listaSimple(){
      this.primero=this.ultimo=null;
    }


    //ingresar

    public void ingresar_primero(Persona x){
      Nodo nuevo = new Nodo(x);
      if(this.primero==null){
        this.primero=this.ultimo=nuevo;
      }else{
        nuevo.setsiguiente(this.primero);
        this.primero=nuevo;
      }
    }

    public void ingresar_ultimo(Persona x){
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

    public void ingresar_medio(Persona x,int pos){
      Nodo nuevo = new Nodo (x);

      Nodo aux = this.primero;

       // insertar al principio si pos == 1
      if (pos == 1 || this.primero == null) {
        ingresar_primero(x);
        return;
      }
      
      for (int i = 1; i < pos; i++) {
        aux=aux.getsiguiente();
      }
      nuevo.setsiguiente(aux.getsiguiente());
      aux.setsiguiente(nuevo);

    }
    
    public listaSimple subarreglo(int n){
    /* 
      *
       * Descripcion= recorre los subarreglos y retorna el sub arreglo cuya sumas sea cercano a 0 (solo de ejemplo ocupando valores INT)
       * inputs:
       *  n= tamaño del subarreglo
       * outputs:
       *  lista best= subarreglo cercano a 0.
       * 
       *
       * */
      listaSimple best  =  new listaSimple();

      int bestdistancia=100000;
      Nodo bestpartida=null;

      Nodo aux =this.primero;
      while(aux!=null){
        Nodo partida= aux;

        int suma=0;
        int count=0;
        //pasar por un subarreglo
        while(partida!=null && count<n){
          suma+=partida.getelemento().getedad();
          partida=partida.getsiguiente();
          count++;
        }
        if(count==n){
          if(suma<0){
            suma*=-1;
          }
  
          if(suma<bestdistancia){
            bestdistancia=suma;
            bestpartida=aux;
          }
        }
        
        aux=aux.getsiguiente();
      }
      //ingresar el nodo a lista
      Nodo temp = bestpartida;
      int count=0;
      while(temp!=null && count<n){
        //best.ingresar_medio(temp, count);
        temp=temp.getsiguiente();
        count++;
      }

      return best;
    }
    

    public void mostrar(){
      Nodo aux = this.primero;

      while(aux!=null){
        System.out.println(aux.getelemento().getNombre());
        System.out.println(aux.getelemento().getedad());
        aux=aux.getsiguiente();
      }
    }
  }