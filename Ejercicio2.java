/**
 * Importamos la clase scanner del paquete java util
 */
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args){
        /**
         * Instanciamos un objeto de la clase scanner para poder leer en pantalla
         */
        Scanner scanner = new Scanner(System.in);

        /**
         * Variable para almacenar el numero ingresado por el usuario
         */
        int numeroIngresado=0;

        /**
         * Solicitamos el numero en cuestion al usuario 
         * Posteriormente lo almacenamos
         */
        System.out.println("Ingresa un numero");
        numeroIngresado = scanner.nextInt();

        /**
         * Ciclo for para mostrar los numeros menores al numero ingresado por el usuario
         */
        for(int i=0; i<=(numeroIngresado-1); i++){
            System.out.println(numeroIngresado-i);
        }
    }
}
