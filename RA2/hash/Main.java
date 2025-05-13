class Main{
    public static void main(String[] args) {
        hash ej1= new hash(8);
        /* 
        System.out.println(ej1.hashing("toyota"));
        System.out.println(ej1.hashing("zubaru"));
        System.out.println(ej1.hashing("lexus"));
        System.out.println(ej1.hashing("hyundai"));
        System.out.println(ej1.hashing("kia"));

        */


        ej1.ingresar("toyota");
        ej1.ingresar("zubaru");
        ej1.ingresar("lexus");
        ej1.ingresar("hyundai");
        ej1.ingresar("kia");

        System.out.println("arreglo antes de la eliminacion");
        ej1.mostrar();

        ej1.eliminar("lexus");
        System.out.println("arreglo despues de la eliminacion");
        ej1.mostrar();

        System.out.println(ej1.buscar("lexus"));
    }
}
