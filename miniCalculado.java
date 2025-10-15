import java.util.Scanner;

public class miniCalculado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     System.out.println("escribe numero: "); int a = sc.nextInt();
    
        

      System.out.println("escribe number: ");
        int b = sc.nextInt();

        
        int suma = (a + b);
        
        
        System.out.println("la suma es:" + suma);

        System.out.println("el valor de la resta es: " + (a - b));

        System.out.println("la multiplicacion de estos numeros es: " + (a*b) );

        System.out.println("el resultado de esta division es: " + (a/b));

        System.out.println("el residuo de esta division es: " + (a%b));

        System.out.println("escribe numero A: ");
        double A = sc.nextDouble();

        System.out.println("escribe numero B: ");
        double B = sc.nextDouble();

        System.out.println("resultado con decimal: " +(A/B));

        // o tambien averigue que es posible de esta forma//

        double c = (double) (a/b);
        System.out.println("el resultado es: " + c);
        //si funciona profe//
        

    }      

    

}
