class Colaestatica{
    //atributos
    private Object[] cola;
    private int tam;
    private int primero;
    private int ultimo;

    //constructor
    public Colaestatica(int tam){
        this.cola = new Object[tam];
        this.tam=tam;
        this.primero=this.ultimo=-1;
    }
    //ingresar datos a la cola estatica
    public void ingresar(Object x){
        if (this.ultimo==this.tam-1){
            System.out.println("lleno");
            return;
        }
        if(this.primero==-1){
            this.primero=0;
        }
        this.ultimo++;
        this.cola[this.ultimo]=x;
    }
    //eliminar el primer valor dentro de la cola
    //desafio: dar una solucion al detalle de esta funcion visto en clases 
    public void eliminar(){
        if(this.primero==-1){
            System.out.println("vacio");
            return;
        }
        if(this.primero==this.ultimo){
            this.primero=this.ultimo=-1;
        }else{
            this.primero++;
        }
    }

    //espacio para la solucion

    //funcion para mostrar los datos dentro de una cola estatica
    public void mostrar(){
        if(this.primero==-1){
            System.out.println("vacio");
        }else{
            for(int i =this.primero;i<=this.ultimo;i++){
                System.out.println(this.cola[i]);
            }
        }
    }
}