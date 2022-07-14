public class Main {
    public static void main(String[] args) {
        int numeroIf = 13;
        int numeroWhile = 2;

        if (numeroIf<0) {
            //número negativo
        }
        else if (numeroIf>0) {
            //número positivo
        }
        else {
            //número 0
        }

        while (numeroWhile<3) {
            numeroWhile ++;
            System.out.println(numeroWhile);
        }

        do {
            numeroWhile = 4;
        } while (numeroWhile<3);

        for (int numeroFor = 0; numeroFor<=3;numeroFor++){
            System.out.println(numeroFor);
        }

        String estacion = "Verano";

        switch(estacion){
            case ("Verano"):
            case("Primavera"):
            case ("Invierno"):
            case ("Otoño"):
                System.out.println(estacion);
                break;
            default:
                System.out.println("No es una estación");
        }

    }
}