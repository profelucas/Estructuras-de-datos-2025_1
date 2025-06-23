class Main{
    public static void main(String[] args) {
        arbolbinario ab = new arbolbinario(5);

        ab.ingresar_datos_normal_izq(1);
        ab.ingresar_datos_normal_der(10);
        ab.imprimir_arbol();
        //System.out.println(ab.profundidad(10));
        arbolbinario ab2 = new arbolbinario(5);

        ab2.ingresar_datos_normal_izq(1);
        ab2.ingresar_datos_normal_der(10);
        ab2.ingresar_datos_normal_der(11);
        System.out.println("ab es igual a ab2?");
        System.out.println(ab.soniguales(ab2));


        System.out.println("existira dos valores dentro del arbol cuya suma sea igual a K?");
        System.out.println(ab2.sumarvalores(11));
    }
}