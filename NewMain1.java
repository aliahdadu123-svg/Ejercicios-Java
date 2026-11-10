import java.util.Scanner;

public class NewMain1 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        <!--pedir una clave-->
        System.out.println("Dame una clave");
        int clave1=teclado.nextInt();
        
        System.out.println("Dame otro una clave");
        int clave2=teclado.nextInt();
        
        if(clave1==clave2){
            System.out.println("Son iguales");
        }
        else if(clave1!=clave2){
            System.out.println("Son diferentes");
        }
        
    }
    
}
