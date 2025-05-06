class Main{
    public static void main(String[] args) {
        Lista ls = new Lista();
        Piloto p1 = new Piloto(81, 28.784, 38.574, 22.483, 0.0,"Oscar Piastri "," McLaren");
        Piloto p2 = new Piloto(63, 28.771, 38.710, 22.528, 0.0,"George Russell "," Mercedes");
        Piloto p3 = new Piloto(4, 28.800, 38.678, 22.582, 0.207,"Lando Norris "," McLaren");
        Piloto p4 = new Piloto(12, 28.836, 38.786, 22.561, 0.030,"Andrea K. Antonelli "," Mercedes");
        Piloto p5 = new Piloto(14,29.231 , 39.502 , 22.901,0.0,"Fernando Alonso","Aston Martin");
        Piloto p6 = new Piloto(16,28.926, 38.714, 22.535,0.0, "Charles Leclerc", "Ferrari");
        Piloto p7 = new Piloto(55,28.894 , 38.929 , 22.723,0.134 ,"Carlos Sainz", "Williams");
        Piloto p8 = new Piloto(22,29.026, 39.177 , 22.900 ,0.125,"Yuki Tsunoda", "Red Bull Racing" );
        Piloto p9 = new Piloto(27,29.039, 39.479, 22.846 ,0.703,"Nico Hülkenberg", "Stake Sauber");
        Piloto p10 = new Piloto(31,29.154 , 39.527 , 22.904 ,0.009,"Esteban Ocon","Haas");
        Piloto p11 = new Piloto(18,29.282, 39.858, 23.106 ,0.037 ,"Lance Stroll", "Aston Martin");
        Piloto p12 = new Piloto(23,29.227, 39.757, 23.037,0.019 ,"Alexander Albon", "Williams");
        Piloto p13 = new Piloto(6,29.081, 39.267, 22.851,0.072,"Isack Hadjar" ,"RB (Visa Cash App)");
        Piloto p14 = new Piloto(30, 29.327, 39.808, 22.958,0.072  ,"Liam Lawson","RB (Visa Cash App)");
        Piloto p15 = new Piloto(87,29.319, 39.796, 22.965,0.293 ,"Oliver Bearman", "Haas");
        Piloto p16 = new Piloto(5,29.520, 39.608, 23.001,0.057,"Gabriel Bortoleto","Stake Sauber");
        Piloto p17 = new Piloto(10,28.883 ,38.694, 22.639, 0.0,"Pierre Gasly", "Alpine");
        Piloto p18 = new Piloto(44,28.955,39.058, 22.759 ,0.0,"Lewis Hamilton", "Ferrari"  );
        Piloto p19 = new Piloto(7, 29.094, 39.215, 22.752,0.184,"Jack Doohan", "Alpine" );
        Piloto p20 = new Piloto(1, 28.880 , 38.855 , 22.688,0.0,"Max Verstappen", "Red Bull Racing");
        
        ls.ingresarpiloto(p1);
        ls.ingresarpiloto(p2);
        ls.ingresarpiloto(p3);
        ls.ingresarpiloto(p4);
        ls.ingresarpiloto(p5);
        ls.ingresarpiloto(p6);
        ls.ingresarpiloto(p7);
        ls.ingresarpiloto(p8);
        ls.ingresarpiloto(p9);
        ls.ingresarpiloto(p10);
        ls.ingresarpiloto(p11);
        ls.ingresarpiloto(p12);
        ls.ingresarpiloto(p13);
        ls.ingresarpiloto(p14);
        ls.ingresarpiloto(p15);
        ls.ingresarpiloto(p16);
        ls.ingresarpiloto(p17);
        ls.ingresarpiloto(p18);
        ls.ingresarpiloto(p19);
        ls.ingresarpiloto(p20);
        System.out.println("orden de los pilotos ordenados");
        ls.mostrar();
        System.out.println("pole position");
        ls.poleposition().mostrarpiloto();

        System.out.println("Mostrar mejores pilotos por cada sector");
        ls.mostrarsector();

        System.out.println("menor deficit");

        ls.menordeficit().mostrarpiloto();

        System.out.println("filtrar por escuderia: ferrari");
        Lista ferrari = ls.filtrarporescuderia("Ferrari");

        ferrari.mostrar();

        System.out.println("filtrar por escuderia: redbull racing");
        Lista redbull = ls.filtrarporescuderia("Red Bull Racing");

        redbull.mostrar();

        System.out.println("pilotos menor al promedio en el sector 1");
        Lista promedio = ls.promedio(1);
        promedio.mostrar();

    }
}