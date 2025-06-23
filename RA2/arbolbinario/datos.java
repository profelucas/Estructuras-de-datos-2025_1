class datos{

    private int valor;
    private int count;

    public datos(int valor){
        this.valor=valor;
        this.count=1;
    }

    public int getvalor(){return this.valor;}
    public int getcount(){return this.count;}

    public void incrementar(){this.count++;}
    
}