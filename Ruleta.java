import java.util.Random;
import java.util.Scanner;

public class Ruleta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd=new Random();
        int[] numeros= new int[3];
        int numero_jugador=0;


        for (int i = 0; i < numeros.length; i++) {
            System.out.println("introduce un número");
            numero_jugador=sc.nextInt();
            numeros[i]=numero_jugador;
        }

        int numero_ruleta=rnd.nextInt(37);
        System.out.println(numero_ruleta);

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]==numero_ruleta){
                System.out.println("has ganado");
            }else{
                System.out.println("has perdido");
            }
        }
    }
}
