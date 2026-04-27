public class Contador {
    // Variable estática STATIC
    private static int total = 0; 
    public int totalNuevo = 0;

    public static void contar(){
        total++;
    }
    public static void contar(int valor){
        total += valor;
    }

    public static int getContar(){
        return total;
    }

}


