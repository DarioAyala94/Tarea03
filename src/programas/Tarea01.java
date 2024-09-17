
package programas;
import java.util.Scanner;
public class Tarea01 {
     public static void main(String[] args) {
        // Crear un objeto Scanner para leer los datos ingresados por el usuario
        Scanner sc = new Scanner(System.in);
        
        // Pedir al usuario que ingrese su edad
        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();
        
        // Usar el comando if para verificar si la persona es mayor de edad
        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }
        
        // Cerrar el scanner
        sc.close();
    }
}
