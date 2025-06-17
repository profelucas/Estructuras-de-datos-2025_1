class Main{
    public static void main(String[] args) {
        arbolbinario ab = new arbolbinario(5);

        ab.ingresar_datos_normal_izq(1);
        ab.ingresar_datos_normal_der(10);
        ab.imprimir_arbol();
        System.out.println(ab.profundidad(10));
    }
}