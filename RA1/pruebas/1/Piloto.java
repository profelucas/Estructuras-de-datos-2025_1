class Piloto{
    private String nombre,escuderia;
    private int numero;
    private Double s1,s2,s3,Ul,deficit=0.0;
    public Piloto (int num, Double s1, Double s2, Double s3, Double def, String n, String esc ){
        this.nombre=n;
        this.escuderia=esc;
        this.numero=num;
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;
        this.deficit=def;
        this.Ul=s1+s2+s3;
    }
    public String getescuderia(){
        return this.escuderia;
    }
    public Double gets1(){
        return s1;
    }
    public Double gets2(){
        return s2;
    }
    public Double gets3(){
        return s3;
    }
    public Double getvueltareal(){
        return Ul+deficit;
    }
    public Double getdeficit(){
        return deficit;
    }
    public void mostrarpiloto(){
        System.out.printf("%d: %s -> s1:%.3f, s1:%.3f, s3: %.3f vuelta real: %.3f\n",this.numero,nombre,s1,s2,s3,getvueltareal());
    }
}