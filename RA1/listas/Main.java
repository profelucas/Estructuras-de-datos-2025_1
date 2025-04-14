public class Main {
    public static void main(String[] args) {
        System.out.println("Lista Simple");
        listaSimple ls = new listaSimple();
        ls.ingresar_primero(5);
        ls.ingresar_primero(6);
        ls.ingresar_ultimo(10);
        ls.ingresar_medio(21, 2);
        //ls.eliminar_primero();
        ls.mostrar();

        System.out.println("Lista Circular");

        ListaCircular lc = new ListaCircular();
        lc.Ingresar_primero(1);
        lc.Ingresar_primero(2);
        lc.Ingresar_primero(56);
        lc.ingresar_ultimo(99);
        lc.mostrar();
    }
}
