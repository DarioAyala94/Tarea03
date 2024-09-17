
package programas;
import java.util.Scanner;
public class Programa03 {
    public static void main(String[] args){
        
        //declarar la variable
        int num;
        String mensaje;
        Scanner lectura=new Scanner(System.in);
        
        //entrada de datos
        System.out.print("Ingrese un numero:");
        num=lectura.nextInt();
        
        //proceso de datos
        if(num>0){
            mensaje="Numero positivo";
        }else if(num<0){
            mensaje="Numero negativo";
        }else{
            mensaje="Numero neutro";
        }    
            //salida de datos
            System.out.println(mensaje);
    }
}
