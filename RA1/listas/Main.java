public class Main {
    public static void main(String[] args) {
        listaSimple ls = new listaSimple();
        ls.ingresar_primero(5);
        ls.ingresar_primero(6);
        ls.ingresar_ultimo(10);
        ls.ingresar_medio(21, 2);
        ls.eliminar_primero();
        ls.mostrar();
    }
}
