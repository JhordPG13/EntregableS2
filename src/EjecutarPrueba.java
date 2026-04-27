public class EjecutarPrueba {
    public static void main(String[] args){
        // Para cambiar el valor de una variable no estatica
        Contador c = new Contador(); // Instanciar
        c.totalNuevo = 100;
        System.out.println("c.totalNuevo = " + c.totalNuevo);

        Contador c1 = new Contador(); // Instanciar
        c1.totalNuevo += 10; // Sumar 10
        System.out.println("c1.totalNuevo = " + c1.totalNuevo);

        // Para cambiar el valor de una variable estatica
        Contador.contar();
        System.out.println("Contador.total: " + Contador.getContar());

        Contador.contar(100);
        System.out.println("Contador.total: " + Contador.getContar());
    }
}
