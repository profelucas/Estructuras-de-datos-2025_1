public class Main{
    public static void main(String[] args ){
        Colaestatica ce = new Colaestatica(5);
        ce.ingresar(5);
        ce.ingresar(6);
        ce.ingresar(1);
        ce.ingresar(10);
        ce.ingresar(9);
        ce.ingresar(11);
        System.out.println("Original");
        ce.mostrar();
        ce.eliminar();
        System.out.println("Editado");
        ce.mostrar();


        Coladinamica cd = new coladinamica();
        cd.ingresar(3);
        cd.ingresar(1);
        cd.ingresar(10);

        cd.mostrar();
    }
}