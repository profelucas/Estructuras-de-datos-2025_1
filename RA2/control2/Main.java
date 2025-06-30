import java.util.ArrayList;

class Main{
    public static void main(String[] args) {
        paciente p1 = new paciente("Eduardo", 21, 20312934, 1, 20, false);
        paciente p2 = new paciente("Lucía", 17, 20562925, 2, 150, true);

        ArrayList<paciente> pacientes = new ArrayList<>();

        pacientes.add(new paciente("María", 70, 20122878, 2, 95, true));
        pacientes.add(new paciente("Carlos", 35, 20123124, 1, 120, false));
        pacientes.add(new paciente("Javier", 50, 2031745, 1, 85, true));
        pacientes.add(new paciente("Ana", 15, 19454512, 2, 30, false));
        pacientes.add(new paciente("Pedro", 65, 25655678, 1, 200, true));
        pacientes.add(new paciente("Sofía", 28, 2294959, 2, 75, false));
        pacientes.add(new paciente("Alex", 19, 18892183, 3, 180, true));
        pacientes.add(new paciente("Mónica", 45, 21798123, 2, 50, false));

        arbolbinario noges = new arbolbinario(p1);
        arbolbinario ges = new arbolbinario(p2);

        for (paciente p : pacientes){
            if (p.getges()){
                ges.ingresar(p);
            }else{
                noges.ingresar(p);
            }
        }
        //mostrar informacion con respecto al ges
        ges.mostrar_ges();


        //mostrar informacion relevante en un arbol elegido (noges)
        noges.mostrar_info();
    }
}