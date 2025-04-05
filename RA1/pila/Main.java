public class Main{
    public static void main(String[] args){
        pilaestatica pe = new pilaestatica(5);
        pe.apilar(3);
        pe.apilar(1);
        pe.apilar(5);
        pe.apilar(2);
        pe.apilar(10);

        pe.mostrar();

        piladinamica pd = new piladinamica();

        pd.apilar(3);
        pd.apilar(1);
        pd.apilar(5);
        pd.mostrar();
    }
}