class arbolbinario {
    // atributos
    private paciente dato;
    private arbolbinario izq;
    private arbolbinario der;

    // Constructor
    public arbolbinario(paciente dato) {
        this.dato = dato;
        this.izq = null;
        this.der = null;
    }

    // Setters y Getters
    public arbolbinario getizq() { return this.izq; }
    public arbolbinario getder() { return this.der; }
    public void setizq(arbolbinario a) { this.izq = a; }
    public void setder(arbolbinario b) { this.der = b; }

    /*
     * Insertar paciente de forma ordenada por tiempo
     * inputs: 
     * paciente a = paciente al que se le va a ingresar al arbol
     */
    public void ingresar(paciente a) {
        if (a == null) return;

        if (a.gettiempo() <= dato.gettiempo()) {
            if (this.izq == null) {
                this.izq = new arbolbinario(a);
            } else {
                this.izq.ingresar(a);
            }
        } else {
            if (this.der == null) {
                this.der = new arbolbinario(a);
            } else {
                this.der.ingresar(a);
            }
        }
    }

    /*
     * Funcion que permite mostrar pacientes GES y contar cuántos superan el límite legal
     */
    public void mostrar_ges() {
        int count = mostrarycontar();
        System.out.println("Existen " + count + " casos que superaron el límite legal");
    }

    private int mostrarycontar() {
        int count = 0;
        this.dato.mostrar_datos();
        if (this.dato.getges() && this.dato.gettiempo() >= 90) {
            count++;
        }

        if (this.izq != null) count += this.izq.mostrarycontar();
        if (this.der != null) count += this.der.mostrarycontar();

        return count;
    }

    /*
     * Mostrar info estadístico del árbol
     */
    public void mostrar_info() {
        System.out.println("Paciente con menor tiempo en lista de espera: ");
        paciente min = this.getmin().dato;
        min.mostrar_datos();

        System.out.println("Paciente con mayor tiempo en lista de espera: ");
        paciente max = this.getmax().dato;
        max.mostrar_datos();

        //esto lo vi en uno de sus respuestas y lo aplique de manera más simple.
        int[] rangos = new int[3];
        int total = contar_nodos();

        busqueda(rangos);

        System.out.println("Menores de edad: " + (rangos[0] * 100.0 / total) + "%");
        System.out.println("Adultos: " + (rangos[1] * 100.0 / total) + "%");
        System.out.println("Adultos mayores: " + (rangos[2] * 100.0 / total) + "%");
    }


    /*
     * funcion de devuelve el menor valor guardado en el arbol
     * output:
     * arbolbinario  = menor nodo encontrado
     */
    private arbolbinario getmin() {
        if (this.izq == null) {
            return this;
        } else {
            return this.izq.getmin();
        }
    }

    /*
     * funcion de devuelve el mayor valor guardado en el arbol
     * output:
     * arbolbinario max = mayor nodo encontrado
     */
    private arbolbinario getmax() {
        if (this.der == null) {
            return this;
        } else {
            return this.der.getmax();
        }
    }
    /*
     * funcion que permite contar segun el rango de edad establecidos. Guarda la informacion en un arreglo de 3 espacios para cada rango. 0 es menor de edad, 1 es edad adulta, 2 edad adulta viaja
     * funcion vista por alguno de ustedes 
     */
    private void busqueda(int[] rangos) {
        if (this.dato.getedad() < 18) {
            rangos[0]++;
        } else if (this.dato.getedad() < 65) {
            rangos[1]++;
        } else {
            rangos[2]++;
        }

        if (this.izq != null) this.izq.busqueda(rangos);
        if (this.der != null) this.der.busqueda(rangos);
    }

    /*
     * Funcion que cuenta los nodos, util para calcular porcentaje.
     * output: 
     * cont = cantidad total de nodos.
     */
    private int contar_nodos() {
        int count = 1; // este nodo

        if (this.izq != null) count += this.izq.contar_nodos();
        if (this.der != null) count += this.der.contar_nodos();

        return count;
    }
}