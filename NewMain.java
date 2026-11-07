
import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i;
        String array[] = new String[5];
        String nombre;
        
        System.out.println("Dame los 5 nombres: ");
        for (i = 0; i < array.length; i++) {
             nombre=teclado.nextLine();
             array[i]=nombre;
        }
            
             for (i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            
    }else{
            System.out.print( array[i] + ",");

    }

        }
    }
}



     
    

