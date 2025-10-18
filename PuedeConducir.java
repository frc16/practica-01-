import java.util.Scanner;
public class PuedeConducir {
    public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);
      
     System.out.println("escribe tu edad: ");
     int edad = scanner.nextInt();
     scanner.nextLine();

     
     
     System.out.print("tienes carnet de conducir?: ");
     String licencia = scanner.nextLine();
     licencia = licencia.toLowerCase();

    
        if(edad<0 || edad>120||!licencia.equals("si")|| licencia.equals("no")){
         if(edad<0 || edad>120){
            System.out.println("edad no valida");}
         if (!licencia.equals("si")||!licencia.equals("no")){
            System.out.println("respuesta no valida");
         }
     } else {
      if(edad>=18 && licencia.equals("si")){
         System.out.println("puedes conducir");
      } else {
      if(edad<18){
         System.out.println("no puedes conducir, porque eres menor de edad");
      }
      if(!licencia.equals("si")){
         System.out.println("no puedes conducir, no tienes licencia");
      }
     }
    }
    scanner.close();
   }
  }


