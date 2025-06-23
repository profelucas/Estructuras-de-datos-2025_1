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
    /*
     * Funcion que verifica si dos arboles binarios son iguales, mediante doble pivote.
     * inputs:
     * arbolbinario q = arbol a comparar.
     * 
     * outputs:
     * true-> si los arboles son iguales.
     * false-> si los arboles no son iguales.
     */
    boolean soniguales(arbolbinario q) {
      arbolbinario p = this;
      boolean ifizq,ifder;

      //discordiancia en las ramas
      if (p == null || q == null) {
          return false;
      }
      //datos incompatibles
      if (p.dato != q.dato) {
        return false;
      }
      //lado izquierdo
      if (p.izq == null) {
        ifizq = (q.izq == null) ;
      } else {
        ifizq= p.izq.soniguales(q.izq);
      }
      //lado derecho
      if (p.der == null) {
        ifder = (q.der == null) ;
      } else {
        ifder= p.der.soniguales(q.der);
      }

      return (ifizq && ifder);
  }

    //pruebe crear una funcion que tome los datos del arbol binario y ordenelo.(50 fichas)

    /*
     * Funcion que permite buscar en el arbol binario el par de nodos cuya suma sea igual a un valor ingresado K.
     * inputs :
     * k= valor entera que se evaluara.
     * outputs:
     * true= se encontro.
     * false= no se encontro.
     * 
     */
    public boolean sumarvalores(int k){
      hash lista = new hash(100);
      return buscarsuma(this, k, lista);
    }

    public boolean buscarsuma(arbolbinario arbol, int k, hash lista){
      //se esta trabajando de manera recursiva

      //condicion de termino
      if (arbol == null) return false;


      int complemento = k -arbol.getdato();
      if (lista.existe(complemento)){
        System.out.println(arbol.getdato()+" + "+ complemento +" = " + k);
        return true;
      }
      //muy escondido pero se esta haciendo una busqueda preorden.
      lista.ingresar(arbol.getdato());
      return buscarsuma(arbol.getizq(), k, lista) || buscarsuma(arbol.getder(), k, lista); 
    }


    /* 
     * funcion dicha en clases que toma el arbol y cuenta la cantidad de valores que tiene.
     * 
     * 
     */

     public void contaryguardar(){
      hash lista = new hash(100);
      recorrereinsertar(this,lista);
      System.out.println("valores del arbol y su cantidad de apariciones");
      lista.mostrar();
     }

     public void recorrereinsertar(arbolbinario arbol, hash lista){
      if (arbol == null){
        return;
      }
      lista.ingresar(arbol.dato);
      recorrereinsertar(arbol.getizq(), lista);
      recorrereinsertar(arbol.getder(), lista);
     }
}