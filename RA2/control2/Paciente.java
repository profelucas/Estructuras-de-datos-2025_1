class paciente{

    private int edad;
    private int rut;
    private String nombre;
    private int genero;
    private int tiempo;
    private boolean ges = false;


    /*
     * a = nombre del paciente
     * b = edad
     * c = rut
     * d = genero (1= masculino, 2 = femenino, 3= otro)
     * e = tiempo dentro de una lista de espera
     * f = Esta cubiero por GES 
     */

    public paciente(String a, int b, int c, int d, int e, boolean f){
        this.nombre= a;
        this.edad= b;
        this.rut= c;
        this.genero=d;
        this.tiempo= e;
        this.ges=f;
    }

    //gettes
    public int getedad(){return edad;}

    public int getrut(){return rut;}

    public String getnombre(){return nombre;}

    public int getgenero(){return genero;}

    public int gettiempo(){return tiempo;}

    public boolean getges(){return ges;}

    public void mostrar_datos(){
        System.out.println("Nombre = "+ nombre);
        System.out.println("Edad = "+ edad);
        System.out.println("Rut = "+ rut);
        System.out.println("Tiempo = "+ tiempo +" dias");

        switch(genero){
            case 1:
                System.out.println("genero hombre");
                break;
            case 2:
                System.out.println("genero Mujer");
                break;
            case 3:
                System.out.println("genero Otro");
                break;
            default:
                System.out.println("genero incorrecto");
                break;
        }

        if(ges){
            System.out.println("El caso esta cubierto por GES");
        }else{
            System.out.println("El caso no esta cubierto por GES");
        }
    }
}