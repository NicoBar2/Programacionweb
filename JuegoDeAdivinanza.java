import java.util.Scanner;
import java.util.Random;

public class JuegoDeAdivinanza {
   public static void main(String[] args) {
       
       Random rand = new Random();
       int numeroAdivinar = rand.nextInt(200) + 1;
       int intentos = 5;
       
       System.out.println("Bienvenido a adivinanza de números.");
       System.out.println("Tienes que adivinar un número entre 1 y 200 en 5 intentos.");

       Scanner sc = new Scanner(System.in);
       
       while(intentos-- > 0) {
           System.out.println("Tienes " + (intentos+1) + " intentos restantes.");
           System.out.println("Ingresa un número:");
           int numeroIngresado = sc.nextInt();
           
           if(numeroIngresado == numeroAdivinar) {
               System.out.println("¡Felicidades! Adivinaste el número.");
               return;
           } else if(numeroIngresado < numeroAdivinar) {
               System.out.println("El número es mayor.");
           } else {
               System.out.println("El número es menor.");
           }
       }
       
       System.out.println("Lo siento, has agotado tus intentos. El número correcto era " + numeroAdivinar + ".");
   }
}
