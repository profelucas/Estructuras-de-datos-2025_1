class hash {
    //atributos

    //se puede trabajar una lista de objetos datos. Revisar datos.java
    private datos[] tabla;
    private int tam;

    public hash(int tam) {
        this.tam = tam;
        this.tabla = new datos[tam];
    }
    //funcion simple de hash.
    private int hashing(int valor) {
        return Math.abs(valor) % tam;
    }

    public void ingresar(int valor) {
        int pos = hashing(valor);
        //solucion de colucion aplicando sondeolineal
        while (tabla[pos] != null) {
            if (tabla[pos].getvalor() == valor) {
                tabla[pos].incrementar();
                return;
            }
            pos = (pos + 1) % tam;
        }

        tabla[pos] = new datos(valor);
    }

    /*
     * funcion que determina si existe un valor ingresado dentro de una lista.
     * 
     * inputs: 
     * valor= valor que se evaluara si existe.
     * 
     * outputs:
     * TRUE = existe.
     * False= no existe.
     */
    public boolean existe(int valor) {
        int pos = hashing(valor);

        int inicio = pos; 
        while (tabla[pos] != null) {
            if (tabla[pos].getvalor() == valor) {
                return true;
            }
            pos = (pos + 1) % tam;
            if (pos == inicio) break;
        }
        return false;
    }

    public void mostrar() {
        for (int i = 0; i < tam; i++) {
            if (tabla[i] != null) {
                System.out.println(i + ": " + tabla[i].getcount());
            }
        }
    }
}