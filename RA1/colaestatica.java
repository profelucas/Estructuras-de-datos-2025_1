class pilaestatica{
    //atributos
    private Object[] pila;
    private int cima;
    private int tam;

    //constructor

    public pilaestatica(int tam){
        this.tam=tam;
        this.cima=-1;
        this.pila=new Object[tam];

    }

    public void apilar (Object x){
        if (this.cima==this.tam-1){
            System.out.println("la pila esta vacia");
        }else{
            this.cima++;
            this.pila[cima]=x;
        }
    }
    public void desapilar(){
        if(this.cima==-1){
            System.out.println("la pila esta vacia");
        }else{
            this.cima--;
        }
    }

    public void mostrar(){
        if(this.cima==-1){
            System.out.println("la pila esta vacia");
        }else{
            for(int i =this.cima; i>=0;i-- ){
                System.out.println(this.pila[i]);
            }
        }
    }
}