class Persona{
    private int Edad;
    private String Nombre;
    private int rut;


    public Persona(int a, String b, int c){
        this.Edad=a;
        this.Nombre=b;
        this.rut=c;
    }

    public String getNombre(){
        return this.Nombre;
    }
    public int getedad(){
        return this.Edad;
    }
}