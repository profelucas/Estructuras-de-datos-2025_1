class arbolbinario{
  //atributos
  private int dato;
  private arbolbinario izq;
  private arbolbinario der;

  public arbolbinario(int dato){
    this.dato = dato;
    this.der = null;
    this.izq = null;
  }
  
  public int getdato(){
    return this.dato;
  }
  public arbolbinario getder(){
    return this.der;
  }
  public arbolbinario getizq(){
    return this.izq;
  }

  public void setdato(int dato){
    this.dato = dato;
  }
  public void setder(arbolbinario der){
    this.der = der;
  }
  public void setizq(arbolbinario izq){
    this.izq = izq;
  }

  //no es mi mejor implementacion
  void ingresar_datos_normal_izq(int dato){
    if(this.izq==null){
      this.izq = new arbolbinario(dato);
    }else{
      if(this.der==null){
        this.der = new arbolbinario(dato); 
      }else{
        this.izq.ingresar_datos_normal_izq(dato);
      }
    }
  }
  
  void ingresar_datos_normal_der(int dato){
    if(this.der==null){
      this.der = new arbolbinario(dato);
    }else{
      if(this.izq==null){
        this.izq = new arbolbinario(dato); 
      }else{
        this.der.ingresar_datos_normal_der(dato);
      }
    }
  }
  
  //imprimir en preorden, construya en postorden y en inorden
  void imprimir_arbol(){
    System.out.println(this.dato);
    if(this.izq!=null){
      this.izq.imprimir_arbol();
    }
    if(this.der!=null){
      this.der.imprimir_arbol();
    }
  }


  int altura() {
      int alturaIzq = (this.izq == null) ? -1 : this.izq.altura();
      int alturaDer = (this.der == null) ? -1 : this.der.altura();
      return Math.max(alturaIzq, alturaDer) + 1;
    }
  
  int profundidad(int valor) {
      if (this.dato == valor) {
        return 0;
      }
      int profundidadIzq = (this.izq == null) ? -1 : this.izq.profundidad(valor);
      int profundidadDer = (this.der == null) ? -1 : this.der.profundidad(valor);

      if (profundidadIzq != -1) {
        return profundidadIzq + 1;
      } else if (profundidadDer != -1) {
        return profundidadDer + 1;
      } else {
        return -1;
      }
    }

    //pruebe crear una funcion que tome los datos del arbol binario y ordenelo.(50 fichas)


}