class Lista{
    private Nodo primero;

    public Lista(){
        this.primero=null;
    }

    public void ingresarpiloto(Piloto x) {
        /*
         * Ingresar un piloto a la lista y ordenarlos segun sus tiempos de mas rapido al mmas lento
         * input:
         * Piloto x = Objeto piloto a ingresar
         */
        Nodo nuevo = new Nodo(x);
    
        // Caso lista vacía
        if (this.primero == null) {
            this.primero = nuevo;
            return;
        }
    
        // Si el nuevo tiene mejor tiempo que el primero, va al inicio
        if (nuevo.getp().getvueltareal() < this.primero.getp().getvueltareal()) {
            nuevo.setsig(this.primero);
            this.primero = nuevo;
            return;
        }
    
        // Insertar en orden
        Nodo actual = this.primero;
        while (actual.getsig() != null && actual.getsig().getp().getvueltareal() < nuevo.getp().getvueltareal()) {
            actual = actual.getsig();
        }
    
        nuevo.setsig(actual.getsig());
        actual.setsig(nuevo);
    }
    public Piloto poleposition(){
        /*
         * retorna el piloto que esta en la poleposition
         * output:
         * Piloto x 
         */
        return this.primero.getp();
    }

    public void mostrarsector(){
        /*
         * registra y devuelve los mejores pilotos por sector mediante busqueda simple
         * 
         */
        Nodo aux=this.primero;
        Nodo s1=this.primero,s2=this.primero,s3=this.primero;
        while(aux!=null){
            if(aux.getp().gets1()<s1.getp().gets1()){
                s1=aux;
            }
            if(aux.getp().gets2()<s2.getp().gets2()){
                s2=aux;
            }
            if(aux.getp().gets3()<s3.getp().gets3()){
                s3=aux;
            }
            aux=aux.getsig();
        }
        System.out.println("mejor s1");
        s1.getp().mostrarpiloto();
        System.out.println("mejor s2");
        s2.getp().mostrarpiloto();
        System.out.println("mejor s3");
        s3.getp().mostrarpiloto();
    }

    public Piloto menordeficit(){
        /*
         * Busca y devuelve el piloto con menor deficit distinto a 0
         * output:
         * piloto best: piloto deseado
         */
        Nodo aux=this.primero;
        Double nn =1000000.0;
        Piloto best=aux.getp();

        while(aux!=null){
            if(aux.getp().getdeficit()!=0  && aux.getp().getdeficit()<nn){
                best=aux.getp();
                nn=aux.getp().getdeficit();
            }
            aux=aux.getsig();
        }
        return best;
    }

    public Lista filtrarporescuderia(String n){
        /*
         *Buscar todos los pilotos segun criterio dado.
         Input:
         String n: escuderia a buscar
         Output:
         Lista: Lista de pilotos que esten en la escuderia
         */
        Lista Escuderia = new Lista();
        Nodo aux=this.primero;

        while(aux!=null){

            if(aux.getp().getescuderia()==n){
                Escuderia.ingresarpiloto(aux.getp());
            }
            aux=aux.getsig();
        }
        return Escuderia;
    }

    public Lista promedio(int sector) {
        /*
         * Dado un sector, se consigue el promedio del sector y muestra y devuelve los pilotos bajo ese promedio
         * input:
         * int sector: sector a analizar (1,2,3)
         * output:
         * lista best: lista de los pilotos que cumplen el criterio
         */
        Lista best = new Lista();
        Nodo aux = this.primero;
        double prom = 0.0;
        int count = 0;
    
        // Calcular el promedio
        while (aux != null) {
            switch (sector) {
                case 1:
                    prom += aux.getp().gets1();
                    break;
                case 2:
                    prom += aux.getp().gets2();
                    break;
                case 3:
                    prom += aux.getp().gets3();
                    break;
                default:
                    return best;
            }
            count++;
            aux = aux.getsig();
        }
    
        double total = prom / count;
        System.out.printf("Suma: %.3f, Promedio: %.3f, Cantidad: %d\n", prom, total, count);
    
        // Obtener pilotos con tiempo menor al promedio
        aux = this.primero;
        while (aux != null) {
            switch (sector) {
                case 1:
                    if (aux.getp().gets1() < total) best.ingresarpiloto(aux.getp());
                    
                    break;
                case 2:
                    if (aux.getp().gets2() < total) best.ingresarpiloto(aux.getp());
                    break;
                case 3:
                    if (aux.getp().gets3() < total) best.ingresarpiloto(aux.getp());
                    break;
            }
            aux = aux.getsig();
        }
    
        return best;
    }
    public void mostrar(){
        /*
         * muestra el contenido de una lista
         */
        Nodo aux=this.primero;

        while(aux!=null){
            aux.getp().mostrarpiloto();
            aux=aux.getsig();
        }

    }
}    
