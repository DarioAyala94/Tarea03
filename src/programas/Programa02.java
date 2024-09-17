
package programas;
import java.util.Scanner;
public class Programa02 {
    public static void main(String[] args){
        
        //declarar variables
        int edad;
        String mensaje;
        Scanner lectura=new Scanner(System.in);
        
        //entrada de datos
        System.out.print("Ingresar su edad:");
        edad=lectura.nextInt();
        
        //proceso de datos
        if (edad>=18){
            mensaje="Es mayor de edad";
        }else{
            mensaje="Es menor de edad";
        }
        
        //salida de datos
        System.out.println(mensaje);
    }
}
