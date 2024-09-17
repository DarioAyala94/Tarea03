
package programas;
import java.util.Scanner;
public class Programa01 {
    public static void main(String[] args){
        
        //declarar las variabls
        int n1,n2,n3,n4,mayor;
        Scanner lectura=new Scanner(System.in);
        
        //entrada de datos
        System.out.print("ingresar el primer numero:");
        n1=lectura.nextInt();
        System.out.print("ingresar el segundo numero:");
        n2=lectura.nextInt();
        System.out.print("ingresar el tercer numero:");
        n3=lectura.nextInt();
        System.out.print("ingresar el cuarto numero:");
        n4=lectura.nextInt();
        
        //proceso de datos
        mayor=n1;
        if(n2>mayor){
            mayor=n2;
        }
        if(n3>mayor){
            mayor=n3;
        }
        if(n4>mayor){
            mayor=n4;
        }
        
        //salida de datos
        System.out.println("El numero mayor es:"+mayor);
    }
}
