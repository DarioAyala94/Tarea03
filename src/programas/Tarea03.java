
package programas;
import java.util.Scanner;
public class Tarea03 {
       public static void main(String[] args) {
        // Crear un objeto Scanner para leer los datos ingresados por el usuario
        Scanner sc = new Scanner(System.in);
        
        // Pedir al usuario que ingrese una nota
        System.out.print("Ingresa la nota del estudiante (0-100): ");
        int nota = sc.nextInt();
        
        // Usar if, else if y else para clasificar la nota
        if (nota >= 0 && nota < 50) {
            System.out.println("Reprobado");
        } else if (nota >= 50 && nota <= 100) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Nota invalida");
        }
        
        // Cerrar el scanner
        sc.close();
    }
}
