import java.util.ArrayList;

public class EjemploLista {
    public static void main(String[] args){
        // Declarar un array de 4 elementos
        int[] listaNumeros = new int[4];
        // Colocamos valores en cada uno de las posiciones del array
        listaNumeros[0] = 10;
        listaNumeros[1] = 20;
        listaNumeros[2] = 30;
        listaNumeros[3] = 40;
        // Listar los numeros
        for(int i=0; i < listaNumeros.length; i++){
            System.out.println("Elemento " + i + " :" + listaNumeros[i]);
        } 
        System.out.println("\nArray List demo");
        // ArrayList
        ArrayList miLista = new ArrayList<>();
        // Agregar valores
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");

        miLista.remove(2);

        // Mostar valores del arraylist
        for(Object dia : miLista ){ // for each
            System.out.println("Dia de la semana: " + dia);
        }
    }
    
}
