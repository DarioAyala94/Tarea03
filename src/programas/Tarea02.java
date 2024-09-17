
package programas;
import java.util.Scanner;
public class Tarea02 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer los datos ingresados por el usuario
        Scanner sc = new Scanner(System.in);
        
        // Pedir al usuario que ingrese un número
        System.out.print("Ingresa un numero: ");
        int numero = sc.nextInt();
        
        // Usar if y else para verificar si el número es par o impar
        if (numero % 2 == 0) {
            System.out.println("El numero " + numero + " es par.");
        } else {
            System.out.println("El numero " + numero + " es impar.");
        }
        
        // Cerrar el scanner
        sc.close();
    }
}
