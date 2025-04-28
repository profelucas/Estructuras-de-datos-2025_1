public class Main {
    public static void main(String[] args) {
        System.out.println("Lista Simple");
        listaSimple ls = new listaSimple();
        //ls.eliminar_primero();
        Persona el1=new Persona(18,"jose",20);
        Persona el2=new Persona(25,"miguel",312);
        ls.ingresar_primero(el1);
        ls.ingresar_primero(el2);

        ls.mostrar();

        System.out.println("Lista circular");
        ListaCircular lc = new ListaCircular();
        Persona el3=new Persona(19,"Daniel",333);
        Persona el4=new Persona(15,"eduardo",123);

        lc.Ingresar_primero(el4);
        lc.Ingresar_primero(el3);
        lc.mostrar();


    }
}
