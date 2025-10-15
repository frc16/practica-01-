import java.util.Scanner;
public class ParOimpar{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("introduce numero: ");
        int numero = scanner.nextInt();

        boolean numeroPar = numero%2==0;
         
        if(numero<0){System.out.println("numero negativo");}
        else if(numero==0){ 
            System.out.println("error, ingresaste 0");
        } else if(numeroPar) { System.out.println("el numero es numero par");

        } else {System.out.println("el numero es impar");}
        
        scanner.close();
        
    }
    
}
