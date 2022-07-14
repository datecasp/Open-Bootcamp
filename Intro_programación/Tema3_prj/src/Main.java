public class Main {
    public static void main(String[] args) {
        int val1 = 2;
        int val2 = 3;
        int val3 = 4;

        SumaVal(val1, val2, val3);

        Coche miCoche = new Coche();
        miCoche.PuertaMas();

        System.out.println(miCoche.puertas);
    }

    public static int SumaVal (int a, int b, int c){
        return a+b+c;
    }
}

class Coche{
    int puertas=0;

    public void PuertaMas(){
        this.puertas++;
    }
}