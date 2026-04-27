import java.util.InputMismatchException;
import java.util.Scanner;

public class ManejoExcepciones {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nombre = null;
        System.out.println("Ingresa tu sueldo mensual");
        double sueldo = sc.nextDouble();
        try{
            System.out.println("Tu sueldo diario es: " + sueldo/20);
            System.out.println(nombre.toUpperCase());
        }catch(InputMismatchException ex){
            System.out.println("Has ingresado un valor no permitido: " + ex);
        }catch(Exception ex){
            System.out.println("Ha ocurrido un error: " + ex);
        }
        
        // Letras en lugar de numero - break
        // Numero negativo -- error de logica
    }
    
}

// int[] array = new int[3];
// System.out.println("Proceso basico");
// try {
//       System.out.println(array[10]); // Sospecha que puede fallar
// }catch(Exception ex){
//       System.out.println("Ha ocurrido una exepción: " + ex);
// }
        
// System.out.println("Informacion importante");